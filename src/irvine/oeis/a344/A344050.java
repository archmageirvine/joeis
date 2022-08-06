package irvine.oeis.a344;
// manually hygeom at 2022-08-06 18:55

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A344050 a(n) = Sum_{k=0..n} (-1)^(n-k)*binomial(n, k)*|Lah(n, k)|. Inverse binomial convolution of the unsigned Lah numbers A271703.
 * @author Georg Fischer
 */
public class A344050 extends HypergeometricSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A344050() {
    super(0, 2, 2, "[[1,-1],[1,-1],[2],[2],[-1]]");
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      super.next();
      return Z.ONE;
    } else {
      return super.nextQ()
        .multiply(mN).multiply(((mN & 1) == 1) ? 1 : -1)
        .multiply(MemoryFactorial.SINGLETON.factorial(mN)).num();
    }
  }
}
