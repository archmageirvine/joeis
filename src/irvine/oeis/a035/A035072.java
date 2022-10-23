package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A035072 a(n) is root of square starting with digit 5: first term of runs.
 * @author Sean A. Irvine
 */
public class A035072 extends Sequence2 {

  private Z mA = Z.valueOf(50);

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return CR.valueOf(mA).sqrt().ceil();
  }
}
