package irvine.oeis.a004;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004794 Least positive integer k such that the fractional part of k*sqrt(5) has its n initial partial quotients all equal to 1.
 * @author Sean A. Irvine
 */
public class A004794 extends Sequence1 {

  private static final int[] S = {2, 5, 7, 7, 10, 11};
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci(12L * (mN / 6) + S[mN % 6]).add(1).divide2();
  }
}
