package irvine.oeis.a137;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000108;

/**
 * A137239.
 * @author Sean A. Irvine
 */
public class A137239 implements Sequence {

  private long mN = 0;
  private int mOldLength = -1;
  private final A000108 mSeq = new A000108();

  @Override
  public Z next() {
    ++mN;
    long c = 0;
    if (mOldLength != -1) {
      if (mOldLength > mN) {
        return Z.ZERO;
      }
      ++c;
    }
    while ((mOldLength = mSeq.next().toString().length()) == mN) {
      ++c;
    }
    return Z.valueOf(c);
  }

}

