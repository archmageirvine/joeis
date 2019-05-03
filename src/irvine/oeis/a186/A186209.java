package irvine.oeis.a186;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.Sequence;

/**
 * A186209 Coefficients of modular function denoted <code>g_5(tau)</code> by Atkin.
 * @author Sean A. Irvine
 */
public class A186209 extends EulerTransformSequence {

  private static class InnerSequence implements Sequence {

    private static final int[] SEQ = {12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 0};
    private int mN = -1;

    @Override
    public Z next() {
      if (++mN >= SEQ.length) {
        mN = 0;
      }
      return Z.valueOf(SEQ[mN]);
    }
  }

  /** Construct the sequence. */
  public A186209() {
    super(new InnerSequence(), 0);
  }
}
