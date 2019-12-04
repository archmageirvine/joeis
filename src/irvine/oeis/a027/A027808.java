package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027808.
 * @author Sean A. Irvine
 */
public class A027808 implements Sequence {

  private long mN = 8;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 3, 12).multiply(55 * mN);
  }
}
