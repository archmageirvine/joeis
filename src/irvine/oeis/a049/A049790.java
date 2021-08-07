package irvine.oeis.a049;

/**
 * A049790 Triangular array T read by rows: T(n,k) = Sum_{j=1..k} floor(n/floor(k/j)).
 * @author Sean A. Irvine
 */
public class A049790 extends A049765 {

  @Override
  protected long t(final long n, final long m) {
    long sum = 0;
    for (long k = 1; k <= m; ++k) {
      sum += n / (m / k);
    }
    return sum;
  }
}
