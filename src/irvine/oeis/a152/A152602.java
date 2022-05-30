package irvine.oeis.a152;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A152602 A symmetrical vector coefficient recursion sequence: a(n)=2*{0,a(n-2,0}+2*{-1/2,a(n-1)}+2*{a(n-1),-1/2}.
 * @author Georg Fischer
 */
public class A152602 extends Triangle {

  /** Construct the sequence. */
  public A152602() {
    hasRAM(false);
  }

  @Override
  public Z compute(final int n, final int k) {
    if (n < 2) {
      return Z.ONE;
    }
    return k == 0 || n == k ? Z.ONE : get(n - 2, k - 1).add(get(n - 1, k - 1)).add(get(n - 1, k)).multiply2();
  }
}
