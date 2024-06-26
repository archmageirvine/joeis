package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004156 Odd numbers written backwards.
 * @author Sean A. Irvine
 */
public class A004156 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    return Functions.REVERSE.z(mN);
  }
}
