package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078396 a(n) = A078395(n+1)/A078395(n).
 * @author Sean A. Irvine
 */
public class A078396 extends A078395 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}

