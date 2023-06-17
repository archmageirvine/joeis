package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A049765 Triangular array T, read by rows: T(n,k) = (k mod n) + (n mod k), for k = 1..n and n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A049765 extends AbstractSequence {

  /* Construct the sequence. */
  public A049765() {
    super(1);
  }

  private long mN = 0;
  private long mM = 1;

  protected long t(final long n, final long m) {
    return n % m + m % n;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(t(mN, mM));
  }
}
