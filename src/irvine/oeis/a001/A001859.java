package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001859 Triangular numbers plus quarter-squares: n*(n+1)/2 + floor((n+1)^2/4) (i.e., A000217(n) + A002620(n+1)).
 * @author Sean A. Irvine
 */
public class A001859 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z m = mN.add(1);
    return mN.multiply(m).divide2().add(m.square().shiftRight(2));
  }
}
