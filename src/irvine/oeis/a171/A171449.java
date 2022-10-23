package irvine.oeis.a171;
// manually 2021-06-24

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A171449 Powers of 2 (A000079) with 1 changed to -1.
 * @author Georg Fischer
 */
public class A171449 extends Sequence0 {

  protected int mN = -1;
  protected Z mAn = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN <= 0) {
      return Z.NEG_ONE;
    } else {
      mAn = mAn.multiply2();
      return mAn;
    }
  } // next
}
