package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A006862 Euclid numbers: 1 + product of the first n primes.
 * @author Sean A. Irvine
 */
public class A006862 extends A002110 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

