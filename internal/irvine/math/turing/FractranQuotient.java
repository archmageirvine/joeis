package irvine.math.turing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * Exact finite threshold and residue quotients of ordered FRACTRAN rules.
 * @author Gregory Morse
 */
public final class FractranQuotient {

  private static final int WIDTH = 11;
  private static final int LIMIT = 100000;
  private static final int SLOTS = 1 << 18;
  private static final int[] THRESHOLDS = {2, 3, 5, 8, 12, 18, 24};
  private final int[][] mRules = new int[10][WIDTH];
  private final int[] mState = new int[WIDTH];
  private final int[] mChoices = new int[WIDTH];
  private final long[] mKeys = new long[SLOTS];
  private final int[] mStamp = new int[SLOTS];
  private final long[] mQueue = new long[LIMIT];
  private int mGeneration;
  private int mSize;
  private int mWidth;
  private int mRuleCount;

  private void parse(final String s) {
    int p = s.indexOf('(') + 1;
    mRuleCount = 0;
    if (p == 0) {
      throw new IllegalArgumentException(s);
    }
    while (p < s.length() && s.charAt(p) != ')') {
      if (s.charAt(p++) != '(' || mRuleCount == mRules.length) {
        throw new IllegalArgumentException(s);
      }
      int w = 0;
      while (p < s.length() && s.charAt(p) != ')') {
        final int first = p;
        if (s.charAt(p) == '-') {
          ++p;
        }
        while (p < s.length() && s.charAt(p) >= '0' && s.charAt(p) <= '9') {
          ++p;
        }
        final int d = Integer.parseInt(s, first, p, 10);
        if (d < -21 || d > 21 || w >= WIDTH) {
          throw new IllegalArgumentException(s);
        }
        mRules[mRuleCount][w++] = d;
        if (p < s.length() && s.charAt(p) == ',') {
          ++p;
          while (p < s.length() && s.charAt(p) == ' ') {
            ++p;
          }
        } else if (p == s.length() || s.charAt(p) != ')') {
          throw new IllegalArgumentException(s);
        }
      }
      if (w == 0 || p == s.length() || mRuleCount > 0 && mWidth != w) {
        throw new IllegalArgumentException(s);
      }
      mWidth = w;
      ++mRuleCount;
      ++p;
      if (p < s.length() && s.charAt(p) == ',') {
        ++p;
        while (p < s.length() && s.charAt(p) == ' ') {
          ++p;
        }
      }
    }
    if (mRuleCount == 0 || p != s.length() - 1) {
      throw new IllegalArgumentException(s);
    }
  }

  private boolean add(final long code) {
    final long h = (code ^ code >>> 29) * 0x9E3779B97F4A7C15L;
    int p = (int) (h >>> 46);
    while (mStamp[p] == mGeneration) {
      if (mKeys[p] == code) {
        return true;
      }
      p = (p + 1) & (SLOTS - 1);
    }
    if (mSize == LIMIT) {
      return false;
    }
    mStamp[p] = mGeneration;
    mKeys[p] = code;
    mQueue[mSize++] = code;
    return true;
  }

  private boolean successors(final int from, final long prefix) {
    if (from == mWidth) {
      return add(prefix);
    }
    for (int options = mChoices[from]; options != 0; options &= options - 1) {
      if (!successors(from + 1, prefix | (long) Integer.numberOfTrailingZeros(options) << (5 * from))) {
        return false;
      }
    }
    return true;
  }

  private boolean closes(final int threshold, final int modulus) {
    if (++mGeneration == 0) {
      Arrays.fill(mStamp, 0);
      mGeneration = 1;
    }
    mSize = 0;
    add(1);
    for (int n = 0; n < mSize; ++n) {
      final long code = mQueue[n];
      for (int i = 0; i < mWidth; ++i) {
        mState[i] = (int) (code >>> (5 * i) & 31);
      }
      int r = 0;
      for (; r < mRuleCount; ++r) {
        int i = 0;
        while (i < mWidth && mState[i] + mRules[r][i] >= 0) {
          ++i;
        }
        if (i == mWidth) {
          break;
        }
      }
      if (r == mRuleCount) {
        return false;
      }
      for (int i = 0; i < mWidth; ++i) {
        int y = mState[i] + mRules[r][i];
        int mask = 0;
        // A large class may cross into several exact small states.
        if (mState[i] >= threshold) {
          for (; y < threshold; y += modulus) {
            mask |= 1 << y;
          }
        }
        final int tag = y < threshold ? y : threshold + (y - threshold) % modulus;
        mChoices[i] = mask | 1 << tag;
      }
      if (!successors(0, 0)) {
        return false;
      }
    }
    return true;
  }

  private boolean proves(final String line) {
    parse(line);
    int needed = 0;
    for (int r = 0; r < mRuleCount; ++r) {
      for (int i = 0; i < mWidth; ++i) {
        needed = Math.max(needed, -mRules[r][i]);
      }
    }
    for (final int threshold : THRESHOLDS) {
      // Rule choice is then constant on each quotient state, including priority.
      if (threshold >= needed) {
        for (int m = 1; m <= 6; ++m) {
          if (closes(threshold, m)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  /**
   * Replay the quotient filter on the open rows of census reports.
   * @param args the reports to check (use - for standard input)
   * @throws IOException if a report cannot be read
   */
  public static void main(final String[] args) throws IOException {
    final FractranQuotient proof = new FractranQuotient();
    long total = 0;
    long left = 0;
    for (final String file : args) {
      try (BufferedReader in = "-".equals(file) ? new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))
        : Files.newBufferedReader(Path.of(file))) {
        for (String line; (line = in.readLine()) != null;) {
          if (line.startsWith("unresolved ") || line.startsWith("replay unresolved ")) {
            ++total;
            if (!proof.proves(line)) {
              ++left;
              System.out.println(line);
            }
          }
        }
      }
    }
    System.out.println("quotient total=" + total + " nonhalting=" + (total - left) + " unresolved=" + left);
  }
}
