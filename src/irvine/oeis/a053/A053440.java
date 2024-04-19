package irvine.oeis.a053;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053440 Number of k-simplices in the first derived complex of the standard triangulation of an n-simplex. Equivalently, T(n,k) is the number of ascending chains of length k+1 of nonempty subsets of the set {1, 2, ..., n+1}.
 * @author Sean A. Irvine
 */
public class A053440 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Functions.FACTORIAL.z(mM + 1).multiply(Stirling.secondKind(mN + 2, mM + 2));
  }
}

