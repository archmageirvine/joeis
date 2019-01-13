package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001311.
 * @author Sean A. Irvine
 */
public class A001311 implements Sequence {

  private static final Z[] SEQ = {Z.ONE,
                                  Z.SIX,
                                  Z.valueOf(36),
                                  Z.valueOf(16),
                                  Z.valueOf(96),
                                  Z.valueOf(76),
                                  Z.valueOf(56),
  };

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == SEQ.length) {
      mN = 2;
    }
    return SEQ[mN];
  }
}
