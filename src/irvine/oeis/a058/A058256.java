package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058256 a(n) = A058254(n+1)/A058254(n).
 * @author Sean A. Irvine
 */
public class A058256 extends A058254 {

  {
    setOffset(1);
    super.next();
  }
  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}
