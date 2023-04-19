package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063086 a(n) = gcd(1 + prime(n+1), 1 + prime(n)).
 * @author Sean A. Irvine
 */
public class A063086 extends A000040 {

  private Z mA = super.next().add(1);

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next().add(1);
    return t.gcd(mA);
  }
}
