package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A000387 Rencontres numbers: number of permutations of [n] with exactly two fixed points.
 * @author Sean A. Irvine
 */
public class A000387 extends A000166 {

  private int mM = 0;

  @Override
  public Z next() {
    if (mM < 2) {
      ++mM;
      return Z.ZERO;
    }
    return super.next().multiply(Binomial.binomial(mN + 2, 2));
  }
}

