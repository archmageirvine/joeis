package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002257.
 * @author Sean A. Irvine
 */
public class A002257 implements Sequence {

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
