package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077206 a(1) = 1 and then smallest n-digit triangular number starting with the least significant digit of the previous term and not a multiple of 10.
 * @author Sean A. Irvine
 */
public class A077206 extends Sequence1 {

  private Z mT = Z.ONE;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    mT = mT.multiply(10);
    final Z trinv = Functions.TRINV.z(mT.multiply(mA.mod(10)));
    mA = Functions.TRIANGULAR.z(trinv.add(1));
    if (mA.mod(10) == 0) {
      mA = Functions.TRIANGULAR.z(trinv.add(2));
    }
    return mA;
  }
}

