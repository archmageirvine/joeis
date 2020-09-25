package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035076 a(n) is root of square starting with digit 9: first term of runs.
 * @author Sean A. Irvine
 */
public class A035076 implements Sequence {

  private Z mA = Z.valueOf(90);

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return CR.valueOf(mA).sqrt().ceil();
  }
}
