package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019464 Multiply by <code>1,</code> add <code>1,</code> multiply by <code>2,</code> add <code>2,</code> etc., start with 1.
 * @author Sean A. Irvine
 */
public class A019464 implements Sequence {

  private Z mA = null;
  private boolean mAdd = false;
  private long mN = 0;

  @Override
  public Z next() {
    mAdd = !mAdd;
    mA = mA == null ? Z.ONE : (mAdd ? mA.add(mN) : mA.multiply(++mN));
    return mA;
  }
}
