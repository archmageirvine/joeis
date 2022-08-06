package irvine.oeis.a317;
// manually hygeom at 2022-08-06 17:03

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A317279 a(n) = Sum_{k=0..n} (-1)^(n-k)*binomial(n-1,k-1)*n^k*n!/k!.
 * @author Georg Fischer
 */
public class A317279 extends HypergeometricSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A317279() {
    super(0, 1, 1, "[[1,-1],[2],[0, 1]]");
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      super.next();
      return Z.ONE;
    } else {
      return super.nextQ().multiply(mN).multiply(((mN & 1) == 1) ? 1 : -1).multiply(MemoryFactorial.SINGLETON.factorial(mN)).num();
    }
  }
}
