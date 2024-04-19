package irvine.oeis.a166;
// manually trecpas/trecpas1

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A166960 Triangle T(n, k) read by rows: T(n, k)= (m*n-m*k+1)*T(n-1, k-1) + k*(m*k-(m-1))*T(n-1, k) where m = 1.
 * @author Georg Fischer
 */
public class A166960 extends Triangle {

  private final int mM;

  /** Construct the sequence. */
  public A166960() {
    this(1);
  }

  /**
   * Generic constructor with parameter.
   * @param m constant (0, 1, 2, 3)
   */
  public A166960(final int m) {
    mM = m;
    setOffset(1);
    hasRAM(false);
  }

  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    return k == 1 || k == n ? Z.ONE : get(n - 2, k - 2).multiply((long) mM * (n - k) + 1).add(get(n - 2, k - 1).multiply(k * ((long) mM * k - (mM - 1))));
  }
}
