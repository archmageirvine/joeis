package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083972 Smallest palindromic prime containing exactly n 1's.
 * @author Sean A. Irvine
 */
public class A083972 extends Sequence1 {

  private final StringBuilder mS = new StringBuilder();
  private final int mDigit;

  protected A083972(final int digit) {
    mDigit = digit;
  }

  /** Construct the sequence. */
  public A083972() {
    this(1);
  }

  private String placePair(final StringBuilder sb, final int pos, final int d) {
    return sb.substring(0, pos) + d + sb.substring(pos, sb.length() - pos) + d + sb.substring(sb.length() - pos);
  }

  private void insertPair(final TreeSet<Z> set, final StringBuilder sb) {
    // Try a double digit insertion
    for (int d = 0; d < 10; ++d) {
      if (d != mDigit) {
        for (int pos = 0; pos <= sb.length() / 2; ++pos) {
          final Z t2 = new Z(placePair(sb, pos, d));
          if (t2.isProbablePrime()) {
            set.add(t2);
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    mS.append(mDigit);
    final Z t0 = new Z(mS);
    if (t0.isProbablePrime()) {
      return t0; // already a palindrome
    }
    // Try single digit insertion
    if ((mS.length() & 1) == 0) {
      for (int d = 0; d < 10; ++d) {
        if (d != mDigit) {
          final String h = String.valueOf(mDigit).repeat(mS.length() / 2);
          final Z t1 = new Z(h + d + h);
          if (t1.isProbablePrime()) {
            return t1;
          }
        }
      }
    }
    // Try double digit insertion
    final TreeSet<Z> set = new TreeSet<>();
    insertPair(set, mS);
    if (!set.isEmpty()) {
      return set.first();
    }
    // Try single digit insertion in middle and one other pair
    if ((mS.length() & 1) == 0) {
      for (int d = 0; d < 10; ++d) {
        if (d != mDigit) {
          final String h = String.valueOf(mDigit).repeat(mS.length() / 2);
          insertPair(set, new StringBuilder(h).append(d).append(h));
        }
      }
    }
    if (!set.isEmpty()) {
      return set.first();
    }
    // Two pairs of digits
    for (int d = 0; d < 10; ++d) {
      if (d != mDigit) {
        for (int pos = 0; pos <= mS.length() / 2; ++pos) {
          insertPair(set, new StringBuilder(placePair(mS, pos, d)));
        }
      }
    }
    if (!set.isEmpty()) {
      return set.first();
    }
    // Center digit and two pairs of digits
    if ((mS.length() & 1) == 0) {
      for (int c = 0; c < 10; ++c) {
        if (c != mDigit) {
          final String h = String.valueOf(mDigit).repeat(mS.length() / 2);
          final StringBuilder g = new StringBuilder(h).append(c).append(h);
          for (int d = 0; d < 10; ++d) {
            if (d != mDigit) {
              for (int pos = 0; pos <= g.length() / 2; ++pos) {
                insertPair(set, new StringBuilder(placePair(g, pos, d)));
              }
            }
          }
        }
      }
      if (!set.isEmpty()) {
        return set.first();
      }
    }
    throw new UnsupportedOperationException("Existing rules insufficient");
  }
}
