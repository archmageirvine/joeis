package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A000449 Rencontres numbers: number of permutations of [n] with exactly 3 fixed points.
 * @author Sean A. Irvine
 */
public class A000449 extends A000166 {

  @Override
  public Z next() {
    return super.next().multiply(Binomial.binomial(mN + 3, 3));
  }
}

