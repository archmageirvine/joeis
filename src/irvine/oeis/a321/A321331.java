package irvine.oeis.a321;
// manually trecpas

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A321331 Triangle read by rows: T(n, k) = (k+1)*S2(n+1, k+1), for n &gt;= k &gt;= 0, and S2 = A048993 (Stirling2).
 * @author Georg Fischer
 */
public class A321331 extends Triangle {

  /** Construct the sequence. */
  public A321331() {
    hasRAM(true);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return k == 0 ? Z.ONE : Stirling.secondKind(n + 1, k + 1).multiply(k + 1);
  }
}
