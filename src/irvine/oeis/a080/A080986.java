package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A080986 extends A080984 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}

