package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036044 BCR(n): write in binary, complement, reverse.
 * @author Sean A. Irvine
 */
public class A036044 implements Sequence {

  protected long mN = -1;
  private long mMask = 1;

  @Override
  public Z next() {
    if (++mN > mMask) {
      mMask = mMask * 2 + 1;
    }
    return Z.valueOf(~Long.valueOf(new StringBuilder(Long.toString(mN, 2)).reverse().toString(), 2) & mMask);
  }
}

