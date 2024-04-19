package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000356 Number of rooted cubic maps with 2n nodes and a distinguished Hamiltonian cycle: (2n)!(2n+1)! / (n!^2*(n+1)!(n+2)!).
 * @author Sean A. Irvine
 */
public class A000356 extends Sequence1 {

  private int mN = 0;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    return Functions.FACTORIAL.z(2 * mN)
      .divide(Functions.FACTORIAL.z(mN)).divide(Functions.FACTORIAL.z(mN))
      .multiply(Functions.FACTORIAL.z(2 * mN + 1))
      .divide(Functions.FACTORIAL.z(mN + 1))
      .divide(Functions.FACTORIAL.z(mN + 2));
  }
}
