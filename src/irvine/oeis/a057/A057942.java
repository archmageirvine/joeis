package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a001.A001567;

/**
 * A057942 Pseudoprimes k to base 2 such that k-2 and k+2 are primes.
 * @author Sean A. Irvine
 */
public class A057942 extends A001567 {

  @Override
  public Z next() {
    while (true) {
      final Z pp = super.next();
      if (pp.subtract(2).isProbablePrime() && pp.add(2).isProbablePrime()) {
        return pp;
      }
    }
  }
}
