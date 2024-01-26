package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068090 Numbers n which divide the right concatenation of the first n even numbers.
 * @author Sean A. Irvine
 */
public class A068090 extends Sequence1 {

  private long mN = 0;
  private long mL = 10;
  private Z mConcat = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      if (2 * ++mN >= mL) {
        mL *= 10;
      }
      mConcat = mConcat.multiply(mL).add(2 * mN);
      if (mConcat.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
