package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A000475 Rencontres numbers: number of permutations of [n] with exactly 4 fixed points.
 * @author Sean A. Irvine
 */
public class A000475 extends A000166 {

  @Override
  public Z next() {
    return super.next().multiply(Binomial.binomial(mN + 4, 4));
  }
}

