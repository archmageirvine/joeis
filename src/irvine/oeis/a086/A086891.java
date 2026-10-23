package irvine.oeis.a086;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086891 Denominator of 3 * sqrt(2) * (Integral_{x=0..1} (1+x^2)^((2n-1)/2) dx - ((2n-1)!! / (2n)!!}) * arsinh(1) ).
 * @author Sean A. Irvine
 */
public class A086891 extends Sequence1 {

  private long mN = 0;
  private Q mR = Q.ZERO;

  @Override
  public Z next() {
    mR = mR.multiply(2 * ++mN - 1).divide(2 * mN).add(Q.TWO.pow(mN - 2).divide(mN));
    return mR.multiply(6).den();
  }
}
