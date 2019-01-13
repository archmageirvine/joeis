package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006364.
 * @author Sean A. Irvine
 */
public class A006364 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if ((Long.bitCount(++mN >>> 1) & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

