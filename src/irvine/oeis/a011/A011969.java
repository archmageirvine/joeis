package irvine.oeis.a011;

import irvine.math.z.Z;

/**
 * A011969.
 * @author Sean A. Irvine
 */
public class A011969 extends A011968 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t);
  }
}
