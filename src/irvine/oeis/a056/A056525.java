package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056525.
 * @author Sean A. Irvine
 */
public class A056525 implements Sequence {

  private String mForward = "";
  private StringBuilder mReverse = new StringBuilder();
  private long mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > 9) {
      mForward = String.valueOf(++mN);
      mReverse = new StringBuilder(mForward).reverse();
      mM = 0;
    }
    return new Z(mForward + mM + mReverse);
  }
}
