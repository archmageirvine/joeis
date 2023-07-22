package irvine.oeis.a052;
// manually 2021-10-25

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A052179 Triangle of numbers arising in enumeration of walks on cubic lattice.
 * <code>T(0, 0)=1, T(n,k)=0 if k &lt; 0 or if k &gt; n;
 * T(n, 0) = x*T(n-1, 0) + T(n-1, 1), T(n,k) = T(n-1,k-1) + y*T(n-1,k) + T(n-1,k+1) for k &gt;= 1</code>.
 * @author Georg Fischer
 */
public class A052179 extends Triangle {

  protected Z mX;
  protected Z mY;

  /** Construct the sequence. */
  public A052179() {
    this(0, 4, 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param x first parameter in recurrence
   * @param y second parameter in recurrence
   */
  public A052179(final int offset, final long x, final long y) {
    super(offset);
    mX = Z.valueOf(x);
    mY = Z.valueOf(y);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : (k == 0
        ? mX.multiply(get(n - 1, 0)).add(get(n - 1, 1))
        : get(n - 1, k - 1).add(mY.multiply(get(n - 1, k))).add(get(n - 1, k + 1))
      );
  }
}
