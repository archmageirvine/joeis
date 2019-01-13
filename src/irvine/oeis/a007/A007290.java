package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007290.
 * @author Sean A. Irvine
 */
public class A007290 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 3).multiply2();
  }
}
