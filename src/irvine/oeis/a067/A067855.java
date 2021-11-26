package irvine.oeis.a067;
// manually euleras A001868 at 2021-11-23 09:22

import irvine.math.z.Z;
import irvine.oeis.EulerTransform;
import irvine.oeis.a001.A001868;

/**
 * A067855 Square of the Euclidean length of the vector of Littlewood-Richardson coefficients of Sum_{lambda |- n} s_lambda^2, where s_lambda are the symmetric Schur functions and the sum runs over all partitions lambda of n.
 * @author Georg Fischer
 */
public class A067855 extends EulerTransform {

  private static final class MySequence extends A001868 {
    private MySequence() {
      super.next();
    }

    @Override
    public Z next() {
      return super.next().divide2();
    }
  }

  /** Construct the sequence. */
  public A067855() {
    super(new MySequence(), 1);
  }
}
