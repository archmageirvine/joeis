package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049039 Geometric Connell sequence: 1 odd, 2 even, 4 odd, 8 even, ...
 * @author Sean A. Irvine
 */
public class A049039 implements Sequence {

  private long mN = 0;
  private long mM = 0;
  private long mT = 1;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = mT;
      mT <<= 1;
      return Z.valueOf(++mN);
    }
    mN += 2;
    return Z.valueOf(mN);
  }
}
