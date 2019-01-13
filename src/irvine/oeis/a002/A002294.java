package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002294.
 * @author Sean A. Irvine
 */
public class A002294 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(5 * mN, mN).divide(4 * mN + 1);
  }
}
