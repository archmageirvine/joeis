package irvine.oeis.a049;

/**
 * A049840 Triangular array T read by rows: T(n,k) = sum of numbers c in the form c = bq + r when Euclidean algorithm acts on n, k, for 1 &lt;= k &lt;= n, n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A049840 extends A049834 {

  @Override
  protected long t(final long n, final long m) {
    return m == 0 ? 0 : n + t(m, n % m);
  }
}
