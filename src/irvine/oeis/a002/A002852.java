package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.cr.CR;
import irvine.oeis.a001.A001620;

/**
 * A002852.
 * @author Sean A. Irvine
 */
public class A002852 extends A001620 {

  private CR mU = getCR();

  @Override
  public Z next() {
    final Z a = mU.floor(32);
    final CR d = mU.subtract(CR.valueOf(a));
    mU = d.inverse();
    return a;
  }
}
