package irvine.oeis.a302;
// manually hygeom at 2022-08-06 16:50

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A302582 a(n) = n! * [x^n] log(1 + x)/(1 - x)^n.
 * <code>Join[{0}, Table[n^2 (2 (n - 1))! HypergeometricPFQ[{1, 1, 1 - n}, {2, 2 - 2 n}, -1]/n!, {n, 19}]]</code>
 * @author Georg Fischer
 */
public class A302582 extends HypergeometricSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A302582() {
    super(0, 3, 2, "[[1],[1],[1,-1],[2],[2,-2],[-1]]");
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      super.next();
      return Z.ZERO;
    } else {
      return super.nextQ()
        .multiply(MemoryFactorial.SINGLETON.factorial(2 * mN - 2))
        .multiply(mN * mN)
        .divide(MemoryFactorial.SINGLETON.factorial(mN))
        .num();
    }
  }
}
