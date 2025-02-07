package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A075073 Numbers k such that k-th perfect power - k is prime: A001597(k) - k is prime.
 * @author Sean A. Irvine
 */
public class A075073 extends A001597 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().subtract(++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

