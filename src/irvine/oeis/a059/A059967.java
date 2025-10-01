package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059967 Number of 9-ary trees.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A059967 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(9 * ++mN, mN).divide(8 * mN + 1);
  }
}
