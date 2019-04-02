package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A006512 Greater of twin primes.
 * @author Sean A. Irvine
 */
public class A006512 extends A001359 {

  @Override
  public Z next() {
    return super.next().add(2);
  }
}
