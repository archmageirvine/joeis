package irvine.oeis.a049;

/**
 * A049801 Triangular array T, read by rows: T(n,k) = n mod floor(k/3), k = 3..n and n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A049801 extends A049765 {

  /** Construct the sequence. */
  public A049801() {
    super(3);
  }

  @Override
  protected long t(final long n, final long m) {
    return (n + 2) % ((m + 2) / 3);
  }
}
