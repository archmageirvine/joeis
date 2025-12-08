package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;

/**
 * A390941 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A390941 extends PrependSequence {

  private static final Z Z961 = Z.valueOf(961);

  /** Construct the sequence. */
  public A390941() {
    super(1, new Sequence1() {
      private long mN = 4;
      @Override
      public Z next() {
        return Z961.shiftLeft(++mN);
      }
    }, 1, 2, 4, 6, 26, 52, 54, 66, 68, 72, 116, 232, 464, 928, 1856, 1922, 3842, 5764, 15372, 15376, 30744, 30752);
  }
}
