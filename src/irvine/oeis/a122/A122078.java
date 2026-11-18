package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.a003.A003087;
import irvine.oeis.triangle.Triangle;

/**
 * A122078 Triangle read by rows: T(n,k) is the number of unlabeled acyclic digraphs with n &gt;= 0 nodes and n-k outnodes (0 &lt;= k &lt;= n).
 * @author Gregory Morse
 */
public class A122078 extends Triangle {
  private final A003087 mDags = new A003087();

  @Override
  protected Z compute(final int n, final int k) {
    return mDags.nonSources(n, k);
  }
}
