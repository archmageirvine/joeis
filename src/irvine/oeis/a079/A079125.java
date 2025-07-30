package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A079125 Number of ways to partition the sum of all divisors of n (sigma(n), A000203) into distinct positive integers not greater than n.
 * @author Sean A. Irvine
 */
public class A079125 extends A079122 {

  private int mN = 0;

  /** Construct the sequence. */
  public A079125() {
    super(1);
  }

  @Override
  public Z next() {
    return mB.get(Functions.SIGMA1.i(++mN), mN);
  }
}

