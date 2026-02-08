package irvine.oeis.a051;

/**
 * A051187 Triangle read by rows: T(n, m) = S1(n, m)*8^(n-m), where S1 are the signed Stirling numbers of first kind A008275 (n &gt;= 1, 1 &lt;= m &lt;= n).
 * @author Sean A. Irvine
 */
public class A051187 extends A051141 {

  @Override
  protected long multiplier() {
    return 8;
  }
}
