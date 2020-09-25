package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035069 a(n) is root of square starting with digit 2: first term of runs.
 * @author Sean A. Irvine
 */
public class A035069 implements Sequence {

  private Z mA = Z.TWO;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return CR.valueOf(mA).sqrt().ceil();
  }
}
