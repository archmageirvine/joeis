package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002108 4th powers written backwards.
 * @author Sean A. Irvine
 */
public class A002108 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Functions.REVERSE.z(mN.pow(4));
  }
}
