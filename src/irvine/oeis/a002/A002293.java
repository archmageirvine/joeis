package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002293.
 * @author Sean A. Irvine
 */
public class A002293 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(4 * mN, mN).divide(3 * mN + 1);
  }
}
