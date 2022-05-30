package irvine.oeis.a136;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A136124 Triangle read by rows: T(n,k) = (-1)^(n+k)*Sum_{j=1..k} s(n,j), where s(n,j) are the signed Stirling numbers of the first kind (n &gt;= 2; 1 &lt;= k &lt;= n-1; s(n,j) = A008275(n,j)).
 * @author Georg Fischer
 */
public class A136124 extends Triangle {

  /** Construct the sequence. */
  public A136124() {
    hasRAM(true);
  }

  /* Maple:
    A136124_row := proc(n) local k, j; 
    `if`(n=0, 1, seq((-1)^(n+1-k)*add(stirling1(n+1, j), j=1..k), k=1..n)) end: 
    seq(print(A136124_row(r)), r=1..6);
  */
  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    Z sum = Z.ZERO;
    for (int j = 1; j <= k; ++j) {
      sum = sum.add(Stirling.firstKind(n + 1, j).multiply((((n + 1 - k) & 1) == 0) ? 1 : -1));
    }
    return sum;
  }
}
