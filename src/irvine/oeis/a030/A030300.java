package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030300 Runs have lengths 2^n, n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A030300 extends Sequence1 {

  private Z mV = Z.ZERO;
  private long mC = 0;
  private int mN = -1;

  @Override
  public Z next() {
    if (--mC <= 0) {
      mC = 1L << ++mN;
      mV = Z.ONE.subtract(mV);
    }
    return mV;
  }
}

