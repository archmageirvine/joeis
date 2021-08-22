package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050948 Pi expressed in base e: Pi = Sum a(i)*exp(-i), i=-1,0,1,2,...
 * @author Sean A. Irvine
 */
public class A050948 implements Sequence {

  private CR mA = CR.PI.divide(CR.E);

  @Override
  public Z next() {
    final Z res = mA.floor();
    mA = mA.subtract(CR.valueOf(res)).multiply(CR.E);
    return res;
  }
}
