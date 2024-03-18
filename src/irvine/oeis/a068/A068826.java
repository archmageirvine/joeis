package irvine.oeis.a068;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068826 a(1) = 2; then the sequence of smallest primes (no zero digits to avoid ambiguity) not included earlier the concatenation of which is the cyclic pattern 23456789123456789123...
 * @author Sean A. Irvine
 */
public class A068826 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private int mN = 1;

  @Override
  public Z next() {
    Z t = Z.ZERO;
    while (true) {
      if (++mN == 10) {
        mN = 1;
      }
      t = t.multiply(10).add(mN);
      if (t.isProbablePrime() && mSeen.add(t)) {
        return t;
      }
    }
  }
}
