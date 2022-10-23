package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002257 Numbers n such that 13*4^n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A002257 extends Sequence1 {

  private long mN = 0;
  private Z mM = Z.valueOf(13);

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mM = mM.shiftLeft(2);
      if (mM.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
