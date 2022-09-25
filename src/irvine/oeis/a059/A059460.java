package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059460 Iteration of unitary-sigma function: a(1) = 2, a(n) = usigma(a(n-1)).
 * @author Sean A. Irvine
 */
public class A059460 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : Jaguar.factor(mA).unitarySigma();
    return mA;
  }
}
