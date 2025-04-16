package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A076755 Nearest integer to the kurtosis excess of the divisors of n.
 * @author Sean A. Irvine
 */
public class A076755 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Z s0 = Functions.SIGMA0.z(mN);
    final Z s1 = Functions.SIGMA1.z(mN);
    final Z s2 = Functions.SIGMA.z(2, mN);
    final Z s3 = Functions.SIGMA.z(3, mN);
    final Z s4 = Functions.SIGMA.z(4, mN);
    return new Q(s4.multiply(s0).subtract(s3.multiply(s1.multiply(4))).add(s2.square().multiply(3)).multiply(s0.square()),
      s0.multiply(s2).subtract(s1.square()).square())
      .subtract(3).round();
  }
}
