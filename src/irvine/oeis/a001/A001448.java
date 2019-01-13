package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001448.
 * @author Sean A. Irvine
 */
public class A001448 implements Sequence {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return Binomial.binomial(2 * mN, mN);
  }
}
