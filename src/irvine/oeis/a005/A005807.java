package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A005807.
 * @author Sean A. Irvine
 */
public class A005807 extends A000108 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.add(mA);
  }
}
