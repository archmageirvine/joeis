package irvine.oeis.a049;

/**
 * A049767 Triangular array T, read by rows: T(n,k) = (k^2 mod n) + (n^2 mod k), for k = 1..n and n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A049767 extends A049765 {

  @Override
  protected long t(final long n, final long m) {
    return (n * n) % m + (m * m) % n;
  }
}
