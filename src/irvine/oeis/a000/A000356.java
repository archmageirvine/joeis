package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A000356 Number of rooted cubic maps with <code>2n</code> nodes and a distinguished Hamiltonian cycle: <code>(2n)!(2n+1)! / (n!^2*(n+1)!(n+2)!)</code>.
 * @author Sean A. Irvine
 */
public class A000356 implements Sequence {

  private int mN = 0;
  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    ++mN;
    return mF.factorial(2 * mN)
      .divide(mF.factorial(mN)).divide(mF.factorial(mN))
      .multiply(mF.factorial(2 * mN + 1))
      .divide(mF.factorial(mN + 1))
      .divide(mF.factorial(mN + 2));
  }
}
