package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a001.A001065;

/**
 * A037020 Numbers n such that sum of proper (or aliquot) divisors of n is a prime.
 * @author Sean A. Irvine
 */
public class A037020 extends A001065 {

  @Override
  public Z next() {
    while (!super.next().isProbablePrime()) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
