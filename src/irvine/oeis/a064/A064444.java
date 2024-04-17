package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A064444 Numbers k such that pi(k) = sopf(k) where sopf(k) is sum of distinct prime factors of k (A008472).
 * @author Sean A. Irvine
 */
public class A064444 extends A000720 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Functions.SOPF.z(mN))) {
        return mN;
      }
    }
  }
}
