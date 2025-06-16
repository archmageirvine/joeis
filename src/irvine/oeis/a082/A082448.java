package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082448 Add 1, multiply by 1, add 2, multiply by 2, etc.; start with 4.
 * @author Georg Fischer
 */
public class A082448 extends Sequence0 {

  private Z mA = null;
  private boolean mAdd = true;
  private long mN = 0;

  @Override
  public Z next() {
    mAdd = !mAdd;
    mA = mA == null ? Z.FOUR : (mAdd ? mA.add(++mN) : mA.multiply(mN));
    return mA;
  }
}
