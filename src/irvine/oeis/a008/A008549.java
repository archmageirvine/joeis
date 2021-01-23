package irvine.oeis.a008;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008549 Number of ways of choosing at most n-1 items from a set of size 2*n+1.
 * @author Sean A. Irvine
 */
public class A008549 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(2 * mN).subtract(Binomial.binomial(2L * mN + 1, mN));
  }
}
