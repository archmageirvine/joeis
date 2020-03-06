package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a001.A001043;

/**
 * A029854 <code>gcd(prime(n)+prime(n+1), prime(n+1)+prime(n+2))</code>.
 * @author Sean A. Irvine
 */
public class A029854 extends A001043 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.gcd(mA);
  }
}
