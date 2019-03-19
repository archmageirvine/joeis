package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019462.
 * @author Sean A. Irvine
 */
public class A019462 implements Sequence {

  private Z mA = null;
  private boolean mAdd = true;
  private long mN = 0;

  @Override
  public Z next() {
    mAdd = !mAdd;
    mA = mA == null ? Z.THREE : (mAdd ? mA.add(++mN) : mA.multiply(mN));
    return mA;
  }
}
