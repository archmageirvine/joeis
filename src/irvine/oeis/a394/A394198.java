package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A394198 Total number of linear intervals in the weak order on the Coxeter group D_n.
 * @author Sean A. Irvine
 */
public class A394198 extends AbstractSequence {

  // After Ludovic Schwob

  private long mN = 3;

  /** Construct the sequence. */
  public A394198() {
    super(4);
  }

  @Override
  public Z next() {
    ++mN;
    Q s = new Q(mN + 2, 2);
    for (long k = 2; k < mN; ++k) {
      if (k == 3) {
        s = s.add(Q.HALF);
      }
      s = s.add(new Q(2 * (mN - k + 1), k + 1));
    }
    return s.multiply(Functions.FACTORIAL.z(mN).shiftLeft(mN - 1)).toZ();
  }
}
