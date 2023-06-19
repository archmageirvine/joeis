package irvine.oeis.a064;

import irvine.math.api.RationalSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064184 Denominator of sequence defined by recursion c(n)=1+c(n-2)/c(n-1), c(0)=0, c(1)=1.
 * @author Sean A. Irvine
 */
public class A064184 extends Sequence0 {

  protected final RationalSequence mRationalSequence = new RationalSequence() {

    private Q mA = null;
    private Q mB = null;

    @Override
    public Q nextQ() {
      if (mB == null) {
        if (mA == null) {
          mA = Q.ZERO;
          return Q.ZERO;
        }
        mB = Q.ONE;
        return Q.ONE;
      }
      final Q t = mA.divide(mB).add(Q.ONE);
      mA = mB;
      mB = t;
      return t;
    }
  };

  @Override
  public Z next() {
    return mRationalSequence.nextQ().den();
  }
}
