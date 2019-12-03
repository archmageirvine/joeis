package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027769.
 * @author Sean A. Irvine
 */
public class A027769 implements Sequence {

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 9).multiply(mN);
  }
}
