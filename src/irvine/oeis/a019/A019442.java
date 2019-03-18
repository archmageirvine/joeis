package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.BinomialTransformSequence;
import irvine.oeis.Sequence;

/**
 * A019442.
 * @author Sean A. Irvine
 */
public class A019442 extends BinomialTransformSequence {

  public A019442() {
    super(new Sequence() {

      private long mN = -1;

      @Override
      public Z next() {
        return ++mN < 4 ? Z.ONE : Z.valueOf((mN & 1) == 0 ? -(2 * mN - 5) : 2 * mN - 5);
      }
    }, 0);
  }
}
