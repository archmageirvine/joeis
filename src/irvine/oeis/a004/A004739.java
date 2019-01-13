package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004739.
 * @author Sean A. Irvine
 */
public class A004739 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < 1) {
      ++mN;
      mM = 2 * mN - 1;
    }
    return Z.valueOf(mM > mN ? mM - mN : mN - mM + 1);
  }
}

