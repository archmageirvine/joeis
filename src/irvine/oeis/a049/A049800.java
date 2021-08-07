package irvine.oeis.a049;

/**
 * A049800 Triangular array T, read by rows: T(n,k) = (n+1) mod floor((k+1)/2), k = 1..n and n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A049800 extends A049765 {

  @Override
  protected long t(final long n, final long m) {
    return (n + 1) % ((m + 1) / 2);
  }
}
