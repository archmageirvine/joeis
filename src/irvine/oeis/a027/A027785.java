package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027785.
 * @author Sean A. Irvine
 */
public class A027785 implements Sequence {

  private long mN = 10;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 1, 12).multiply(6 * mN);
  }
}
