package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A394193 Irregular triangle read by rows: T(n,k) is the number of linear intervals of height k in the weak order on D_n (0 &lt;= k &lt;= n-1).
 * @author Sean A. Irvine
 */
public class A394193 extends AbstractSequence {

  // After Ludovic Schwob

  private long mN = 4;
  private long mM = -1;

  /** Construct the sequence. */
  public A394193() {
    super(4);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    final Z nW = Functions.FACTORIAL.z(mN).shiftLeft(mN - 1);
    if (mM == 0) {
      return nW;
    }
    if (mM == 1) {
      return nW.multiply(mN).divide2();
    }
    Q s = new Q(2 * (mN - mM + 1), mM + 1);
    if (mM == 3) {
      s = s.add(Q.HALF);
    }
    return s.multiply(nW).toZ();
  }
}
