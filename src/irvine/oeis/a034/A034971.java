package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A034971 a(n) = floor(E_(n+1)/E_(n)) where E_n is n-th Euler number (see A028296 and A000364).
 * @author Sean A. Irvine
 */
public class A034971 extends A000364 {

  {
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
