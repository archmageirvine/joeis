package irvine.oeis.a274;
// manually hygeom at 2022-08-06 15:16

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A274634 a(n) = n!*A003436(n).
 * @author Georg Fischer
 */
public class A274634 extends HypergeometricSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A274634() {
    super(1, 1, 1, "[[0,-1],[1,-2],[-2]]");
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      super.next();
      return Z.ZERO;
    } else {
      return super.nextQ()
        .multiply(MemoryFactorial.SINGLETON.factorial(mN))
        .multiply(MemoryFactorial.SINGLETON.doubleFactorial(2 * mN - 1)).num();
    }
  }
}
