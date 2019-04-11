package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019465 Multiply by 1, add 1, multiply by 2, add 2, etc., start with 2.
 * @author Sean A. Irvine
 */
public class A019465 implements Sequence {

  private Z mA = null;
  private boolean mAdd = false;
  private long mN = 0;

  @Override
  public Z next() {
    mAdd = !mAdd;
    mA = mA == null ? Z.TWO : (mAdd ? mA.add(mN) : mA.multiply(++mN));
    return mA;
  }
}
