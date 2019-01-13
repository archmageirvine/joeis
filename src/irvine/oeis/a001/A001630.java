package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000078;

/**
 * A001630.
 * @author Sean A. Irvine
 */
public class A001630 extends A000078 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = mA.add(t);
    mA = t;
    return r;
  }
}
