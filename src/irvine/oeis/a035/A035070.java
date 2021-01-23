package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035070 a(n) is root of square starting with digit 3: first term of runs.
 * @author Sean A. Irvine
 */
public class A035070 implements Sequence {

  private Z mA = Z.THREE;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return CR.valueOf(mA).sqrt().ceil();
  }
}
