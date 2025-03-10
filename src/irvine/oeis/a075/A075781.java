package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A075781 Primes of the form perfect_power(n)+n.
 * @author Sean A. Irvine
 */
public class A075781 extends A001597 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z pp = super.next().add(++mN);
      if (pp.isProbablePrime()) {
        return pp;
      }
    }
  }
}
