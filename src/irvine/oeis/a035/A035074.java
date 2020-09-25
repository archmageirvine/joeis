package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035074 a(n) is root of square starting with digit 7: first term of runs.
 * @author Sean A. Irvine
 */
public class A035074 implements Sequence {

  private Z mA = Z.valueOf(70);

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return CR.valueOf(mA).sqrt().ceil();
  }
}
