package irvine.oeis.a033;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000796;

/**
 * A033186 Remove all <code>2</code>'s from decimal expansion of Pi, then all <code>3</code>'s, ..., then all <code>11's, ..</code>. (running through primes in order).
 * @author Sean A. Irvine
 */
public class A033186 extends A000796 {

  // Note: This sequence does not "close up" after each prime removal.  If it did
  // close up, then the sequence would likely be empty.

  // It suffices to look at each piece of the sequence of pi leading up to a "2" separately.

  private String mDigits = "";
  private int mM = 0;

  // Cache the primes since we reuse them in each chunk
  private final Sequence mPrimeSeq = new SkipSequence(new A033274(), 1); // can safely skip over 2
  private final ArrayList<String> mPrimes = new ArrayList<>();

  private String prime(final int m) {
    while (m >= mPrimes.size()) {
      mPrimes.add(mPrimeSeq.next().toString());
    }
    return mPrimes.get(m);
  }

  private int maxGap(final String s) {
    // Any prime remaining must end with an odd digit.
    // Find the longest remaining span that could conceivably be prime.
    int max = 0;
    for (int j = 0, k = s.indexOf('z'); k >= 0; j = k + 1, k = s.indexOf('z', k + 1)) {
      // We already dealt with 2, any prime must end with an odd digit
      int i = k - 1;
      while (i > j && (s.charAt(i) & 1) == 0) {
        --i;
      }
      if (i - j + 1 > max) {
        max = i - j + 1;
      }
    }
    return max;
  }

  @Override
  public Z next() {
    while (mM >= mDigits.length()) {
      final StringBuilder piChunk = new StringBuilder();
      while (true) {
        final Z t = super.next();
        if (Z.TWO.equals(t)) {
          break;
        }
        piChunk.append(t);
      }
      piChunk.append('z'); // a sentinel
      // piChunk is now "[^2]*", run through A033274 removing this primes
      String chunk = piChunk.toString();
      int m = -1;
      while (true) {
        final String s = prime(++m);
        chunk = chunk.replace(s, "z");
        if (s.length() > maxGap(chunk)) {
          break;
        }
      }
      chunk = chunk.replace("z", "");
      mDigits = chunk;
      mM = 0;
    }
    return Z.valueOf(mDigits.charAt(mM++) - '0');
  }
}
