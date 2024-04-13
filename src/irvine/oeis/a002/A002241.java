package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002241 10th powers written backwards.
 * @author Sean A. Irvine
 */
public class A002241 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Functions.REVERSE.z(mN.pow(10));
  }
}
