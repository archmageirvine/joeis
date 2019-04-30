package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001340 E.g.f.: <code>2*exp(x)/(1-x)^3</code>.
 * @author Sean A. Irvine
 */
public class A001340 extends A001339 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = t.subtract(mA);
    mA = t;
    return r;
  }
}
