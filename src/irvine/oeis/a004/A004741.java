package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004741 Concatenation of sequences (1,3,..,2n-1,2n,2n-2,..,2) for n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A004741 extends Sequence1 {

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

