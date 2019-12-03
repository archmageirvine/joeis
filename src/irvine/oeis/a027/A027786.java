package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027786.
 * @author Sean A. Irvine
 */
public class A027786 implements Sequence {

  private long mN = 11;

  @Override
  public Z next() {
    return Binomial.binomial(++mN + 1, 13).multiply(13 * mN).divide2();
  }
}
