package irvine.oeis.a277;
// manually rootet at 2023-02-20 10:45

import irvine.math.z.Z;
import irvine.oeis.a003.A003266;
import irvine.oeis.transform.RootSequence;

/**
 * A277363 Self-convolution of a(n)/4^n gives fibonorials (A003266).
 * @author Georg Fischer
 */
public class A277363 extends RootSequence {

  /** Construct the sequence. */
  public A277363() {
    super(0, new A003266() {
      private int mN1 = -1;

      @Override
      public Z next() {
        ++mN1;
        return super.next().multiply(Z.FOUR.pow(mN1));
      }
    }.skip(1), 1, 2);
  }
}
