package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a051.A051378;

/**
 * A049603 (1+e)-sigma perfect numbers: (1+e) - sigma(x) = 2*x.
 * @author Sean A. Irvine
 */
public class A049603 extends A051378 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z.valueOf(2L * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

