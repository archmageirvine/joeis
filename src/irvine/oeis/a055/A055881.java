package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055881 a(n) = largest m such that m! divides n.
 * @author Sean A. Irvine
 */
public class A055881 implements Sequence {

  private long mN = 0;
  private final long[] mFactorial = new long[20];
  {
    mFactorial[0] = 1;
    for (int k = 1; k < mFactorial.length; ++k) {
      mFactorial[k] = mFactorial[k - 1] * (k + 1);
    }
  }

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (mN % mFactorial[k] == 0) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
