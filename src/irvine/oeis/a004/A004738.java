package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004738 Concatenation of sequences <code>(1,2,...,n-1,n,n-1,...,2)</code> for <code>n &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A004738 implements Sequence {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < 2) {
      ++mN;
      mM = 2 * mN - 1;
    }
    return Z.valueOf(mM > mN ? 2 * mN - mM : mM);
  }
}

