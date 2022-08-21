package irvine.oeis.a293;
// manually hygeom at 2022-08-06 15:16

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.HypergeometricSequence;

/**
 * A293145 a(n) = n! * [x^n] exp(n*x/(1 - x)).
 * <code>Join[{1}, Table[n n! Hypergeometric1F1[1 - n, 2, -n], {n, 1, 18}]]</code>
 * @author Georg Fischer
 */
public class A293145 extends HypergeometricSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A293145() {
    super(1, 1, 1, "[[1,-1],[2],[0,-1]]");
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    } else {
      return super.nextQ().multiply(mN).multiply(MemoryFactorial.SINGLETON.factorial(mN)).num();
    }
  }

  @Override
  public int getOffset() {
    return 0;
  }
}
