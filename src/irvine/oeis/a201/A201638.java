package irvine.oeis.a201;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A201638 Triangle read by rows, T(n,k) for 0&lt;=k&lt;=n, generalizes the colored Motzkin paths of A107264.
 * Recurrence: <code>T(0, 0)=1, T(0,k)=0 for k&gt;0 and for n&gt;=1 T(n,k) = T(n-1,k-1)+3*T(n-1,k)+3*T(n-1,k+1)</code>.
 * @author Georg Fischer
 */
public class A201638 extends Triangle {

  /** Construct the sequence. */
  public A201638() {
    setOffset(0);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 || n == k ? Z.ONE : get(n - 1, k - 1).add(get(n - 1, k).multiply(3)).add(get(n - 1, k + 1).multiply(3));
  }
}
