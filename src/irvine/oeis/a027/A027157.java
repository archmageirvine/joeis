package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027157 Triangular array T given T(n,k)=(1/2)*t(n+1,k+1), 0&lt;=k&lt;=n, n &gt;= 0, t given by A027144.
 * @author Sean A. Irvine
 */
public class A027157 extends A027144 {

  private long mN = -1;
  private long mM = 0;

  /** Construct the sequence. */
  public A027157() {
    this(1);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A027157(final int offset) {
    super(offset);
  }

  protected Z t(final long n, final long m) {
    return get(n + 1, m + 1).divide2();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
