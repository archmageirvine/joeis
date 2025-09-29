package irvine.oeis.a388;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a049.A049419;

/**
 * A388970 Lexicographically earliest sequence of strictly increasing numbers such that the number of exponential divisors of its partial products is strictly increasing.
 * @author Sean A. Irvine
 */
public class A388970 extends Sequence1 {

  private final DirectSequence mExponentialDivisors = new A049419();
  private long mN = 0;
  private Z mE = Z.ZERO;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z t = mProd.multiply(++mN);
      final Z e = mExponentialDivisors.a(t);
      if (e.compareTo(mE) > 0) {
        mE = e;
        mProd = t;
        return Z.valueOf(mN);
      }
    }
  }
}

