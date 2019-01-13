package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014068.
 * @author Sean A. Irvine
 */
public class A014068 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN * (mN + 1) / 2, mN);
  }
}
