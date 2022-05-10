package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A069482 a(n) = prime(n+1)^2 - prime(n)^2.
 * @author Sean A. Irvine
 */
public class A069482 extends A000040 {

  private Z mP = super.next().square();

  @Override
  public Z next() {
    final Z t = mP;
    mP = super.next().square();
    return mP.subtract(t);
  }
}

