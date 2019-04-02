package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.Sequence;

/**
 * A128663 Expansion of eta(q^3) * eta(q^33) / ( eta(q)* eta(q^11)) in powers of q.
 * @author Sean A. Irvine
 */
public class A128663 extends EulerTransformSequence {

  private static class InnerSequence implements Sequence {

    private static final int[] SEQ = {1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 2, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 2, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0};
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
  public A128663() {
    super(new InnerSequence(), 0);
  }
}
