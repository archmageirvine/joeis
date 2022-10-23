package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007607 Skip 1, take 2, skip 3, etc.
 * @author Sean A. Irvine
 */
public class A007607 extends Sequence1 {

  private long mN = 1;
  private long mS = 2;
  private long mT = 2;

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
