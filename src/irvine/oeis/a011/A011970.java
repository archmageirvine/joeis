package irvine.oeis.a011;

import irvine.math.z.Z;

/**
 * A011970.
 * @author Sean A. Irvine
 */
public class A011970 extends A011969 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t);
  }
}
