package irvine.oeis.a014;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014120.
 * @author Sean A. Irvine
 */
public class A014120 implements Sequence {

  private static final long[] SMALL_CASES = {0, 10, 25, 39, 77, 679};
  private int mN = -1;

  // This code assumes this sequence is increasing
  // Stores numbers of form 2*3*4*5*6*7*8*9*
  private final TreeSet<Z> mCandidates = new TreeSet<>();
  {
    for (long k = 2; k < 10; ++k) {
      mCandidates.add(Z.valueOf(k));
    }
  }

  private int persistence(final Z n) {
    if (n.compareTo(Z.TEN) < 0) {
      return 0;
    }
    final String s = n.toString();
    Z p = Z.ONE;
    for (int k = 0; k < s.length(); ++k) {
      final char c = s.charAt(k);
      if (c != '0') {
        p = p.multiply(c - '0');
      }
    }
    return 1 + persistence(p);
  }

  @Override
  public Z next() {
    if (++mN < SMALL_CASES.length) {
      return Z.valueOf(SMALL_CASES[mN]);
    }
    while (true) {
      final Z c = mCandidates.pollFirst();
      if (persistence(c) == mN) {
        return c;
      }
      final Z c10 = c.multiply(10);
      for (long k = c.mod(10); k < 10; ++k) {
        mCandidates.add(c10.add(k));
      }
    }
  }
}
