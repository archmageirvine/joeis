package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.transform.BinomialTransformSequence;

/**
 * A019442 Numbers n such that a Hadamard matrix of order n exists.
 * @author Sean A. Irvine
 */
public class A019442 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A019442() {
    super(new Sequence0() {

      private long mN = -1;

      @Override
      public Z next() {
        return ++mN < 4 ? Z.ONE : Z.valueOf((mN & 1) == 0 ? -(2 * mN - 5) : 2 * mN - 5);
      }
    }, 0);
  }
}
