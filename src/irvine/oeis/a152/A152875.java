package irvine.oeis.a152;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A152875 Number of permutations of {1, 2,...,n} (n &gt;= 2) with all odd entries preceding all even entries or all even entries preceding all odd entries.
 * a(2n) = 2n!^2; a(2n+1) = 2n!(n+1)!.
 * @author Georg Fischer
 */
public class A152875 implements Sequence {

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();
  protected int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final int n = mN / 2;
    return ((mN & 1) == 0)
      ? FACTORIAL.factorial(n).square().multiply2()
      : FACTORIAL.factorial(n).multiply(FACTORIAL.factorial(n + 1)).multiply2();
  }
}
