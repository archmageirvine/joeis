package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A066813 a(n) = lcm(phi(n), phi(n+1)).
 * @author Sean A. Irvine
 */
public class A066813 extends A000010 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.lcm(mA);
  }
}

