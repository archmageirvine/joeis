package irvine.oeis.a049;

/**
 * A049840 Triangular array T read by rows: T(n,k) = sum of numbers c in the form c = bq + r when Euclidean algorithm acts on n, k, for 1 &lt;= k &lt;= n, n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A049840 extends A049834 {

  @Override
  protected long t(long n, long m) {
    long sum = 0;
    while (m != 0) {
      sum += n;
      final long t = m;
      m = n % m;
      n = t;
    }
    return sum;
  }
}
