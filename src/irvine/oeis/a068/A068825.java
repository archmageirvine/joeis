package irvine.oeis.a068;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068825 a(1) = 3 and the sequence of smallest primes not included earlier, the concatenation of which is the cyclic pattern 357913579135...
 * @author Sean A. Irvine
 */
public class A068825 extends Sequence1 {

  private static final long[] DIGITS = {3, 5, 7, 9, 1};
  private final HashSet<Z> mSeen = new HashSet<>();
  private int mN = -1;

  @Override
  public Z next() {
    Z t = Z.ZERO;
    while (true) {
      if (++mN == DIGITS.length) {
        mN = 0;
      }
      t = t.multiply(10).add(DIGITS[mN]);
      if (t.isProbablePrime() && mSeen.add(t)) {
        return t;
      }
    }
  }
}
