package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050949 e expressed in base Pi: e = Sum a(i)*Pi^(-i), i=0,1,2,...
 * @author Sean A. Irvine
 */
public class A050949 implements Sequence {

  private CR mA = CR.E;

  @Override
  public Z next() {
    final Z res = mA.floor();
    mA = mA.subtract(CR.valueOf(res)).multiply(CR.PI);
    return res;
  }
}
