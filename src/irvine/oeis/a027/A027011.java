package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027011 Triangular array T read by rows: T(n,k) = t(n, 2k+1) for 0 &lt;= k &lt;= floor((2n-1)/2), t given by A027960, n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A027011 extends A027960 {

  /** Construct the sequence. */
  public A027011() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  protected Z t(final long n, final long m) {
    return get(n, 2 * m + 1);
  }

  @Override
  public Z next() {
    if (++mM > (2 * mN - 1) / 2) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
