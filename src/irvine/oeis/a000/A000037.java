package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000037 Numbers that are not squares (or, the nonsquares).
 * @author Sean A. Irvine
 */
public class A000037 extends AbstractSequence {

  /** Construct the sequence. */
  public A000037() {
    super(1);
  }

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long s = LongUtils.sqrt(++mN);
      if (s * s != mN) {
        break;
      }
    }
    return Z.valueOf(mN);
  }
}

