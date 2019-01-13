package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007228.
 * @author Sean A. Irvine
 */
public class A007228 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(4 * mN, mN).multiply(3).divide(mN + 1);
  }
}
