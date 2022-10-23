package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A019463 Add 1, multiply by 1, add 2, multiply by 2, etc., start with 1.
 * @author Sean A. Irvine
 */
public class A019463 extends Sequence0 {

  private Z mA = null;
  private boolean mAdd = true;
  private long mN = 0;

  @Override
  public Z next() {
    mAdd = !mAdd;
    mA = mA == null ? Z.ONE : (mAdd ? mA.add(++mN) : mA.multiply(mN));
    return mA;
  }
}
