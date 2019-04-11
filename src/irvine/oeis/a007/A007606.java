package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007606 Take <code>1,</code> skip <code>2,</code> take <code>3,</code> etc.
 * @author Sean A. Irvine
 */
public class A007606 implements Sequence {

  private long mN = 0;
  private long mS = 1;
  private long mT = 1;

  @Override
  public Z next() {
    if (mT == 0) {
      mN += ++mS;
      mT = ++mS;
    }
    --mT;
    return Z.valueOf(++mN);
  }
}
