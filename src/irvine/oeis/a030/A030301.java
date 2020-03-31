package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030301 n-th run has length <code>2^(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A030301 implements Sequence {

  private Z mV = Z.ONE;
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

