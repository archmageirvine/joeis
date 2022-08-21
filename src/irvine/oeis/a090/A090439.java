package irvine.oeis.a090;
// manually hygeom at 2022-08-04 18:01

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A090439 Alternating row sums of array A090438 ((4,2)-Stirling2).
 * @author Georg Fischer
 */
public class A090439 extends HypergeometricSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A090439() {
    super(0, 1, 1, "[[0,-2],[3],[1]]"); // "assuming offset 0"
  }

  @Override
  public Z next() {
    ++mN;
    return super.nextQ().multiply(MemoryFactorial.SINGLETON.factorial(2 * mN + 2)).divide(2).num();
  }

  @Override
  public int getOffset() {
    return 1;
  }
}
