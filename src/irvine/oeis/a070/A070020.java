package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A070020 At these values of k the first, 2nd and 3rd cyclotomic polynomials all give prime numbers.
 * @author Sean A. Irvine
 */
public class A070020 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.square().add(p.multiply(3)).add(3).isProbablePrime()) {
        return p.add(1);
      }
    }
  }
}

