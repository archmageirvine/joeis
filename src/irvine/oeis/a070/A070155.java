package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A070155 Numbers k such that k-1, k+1 and k^2+1 are prime numbers.
 * @author Sean A. Irvine
 */
public class A070155 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next().add(1);
      if (k.square().add(1).isProbablePrime()) {
        return k;
      }
    }
  }
}
