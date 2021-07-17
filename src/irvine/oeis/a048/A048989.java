package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A048989 Numbers n such that pi(n) is prime.
 * @author Sean A. Irvine
 */
public class A048989 extends A000720 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().isProbablePrime()) {
        return mN;
      }
    }
  }
}

