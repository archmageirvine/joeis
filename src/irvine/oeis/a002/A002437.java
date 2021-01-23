package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A002437 a(n) = A000364(n) * (3^(2*n+1) + 1)/4.
 * @author Sean A. Irvine
 */
public class A002437 extends A000364 {

  private Z mMul = null;

  @Override
  public Z next() {
    mMul = mMul == null ? Z.THREE : mMul.multiply(9);
    return super.next().multiply(mMul.add(1)).shiftRight(2);
  }
}
