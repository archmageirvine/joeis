package irvine.oeis.a020;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020918 Expansion of 1/(1-4*x)^(7/2).
 * @author Sean A. Irvine
 */
public class A020918 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN).multiply(2 * mN + 5).multiply(2 * mN + 3).multiply(2 * mN + 1).divide(15);
  }
}
