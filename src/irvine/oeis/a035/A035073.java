package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035073 a(n) is root of square starting with digit 6: first term of runs.
 * @author Sean A. Irvine
 */
public class A035073 extends Sequence1 {

  private Z mA = Z.SIX;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return CR.valueOf(mA).sqrt().ceil();
  }
}
