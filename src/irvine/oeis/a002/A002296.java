package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002296.
 * @author Sean A. Irvine
 */
public class A002296 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(7 * mN, mN).divide(6 * mN + 1);
  }
}
