package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a019.A019434;

/**
 * A393485 Areas of Heron triangles whose sides all have prime power lengths.
 * @author Sean A. Irvine
 */
public class A393485 extends A019434 {

  private Z mA = Z.FOUR;

  @Override
  public Z next() {
    final Z f = mA;
    mA = super.next();
    return mA.subtract(2).multiply(f.subtract(1)).multiply2();
  }
}
