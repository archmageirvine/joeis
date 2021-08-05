package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A024675 Average of two consecutive odd primes.
 * @author Sean A. Irvine
 */
public class A024675 extends A065091 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t).divide2();
  }
}
