package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A068147 Primes in right concatenation of triangular numbers.
 * @author Sean A. Irvine
 */
public class A068147 extends Sequence1 {

  private final Sequence mTriangular = new A000217().skip();
  private Z mA = Z.ZERO;
  private Z mMul = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z t = mTriangular.next();
      while (mMul.compareTo(mA) <= 0) {
        mMul = mMul.multiply(10);
      }
      mA = t.multiply(mMul).add(mA);
      if (mA.isProbablePrime()) {
        return mA;
      }
    }
  }
}
