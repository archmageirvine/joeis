package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a056.A056924;

/**
 * A061408.
 * @author Sean A. Irvine
 */
public class A061408 extends A056924 {

  private long mCount = super.next().longValue();
  private Z mN = Z.TWO;

  @Override
  public Z next() {
    if (--mCount < 0) {
      mN = mN.add(2);
      mCount = super.next().longValue() - 1;
    }
    return mN;
  }
}

