package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007556.
 * @author Sean A. Irvine
 */
public class A007556 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(8 * ++mN, mN).divide(7 * mN + 1);
  }
}
