package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004741 Concatenation of sequences <code>(1,3,..,2n-1,2n,2n-2,..,2)</code> for <code>n &gt;= 1</code>.
 * @author Sean A. Irvine
 */
public class A004741 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    mM = (mM & 1) == 0 ? mM - 2 : mM + 2;
    if (mM <= 0) {
      ++mN;
      mM = 1;
    } else if (mM > 2 * mN) {
      --mM;
    }
    return Z.valueOf(mM);
  }
}

