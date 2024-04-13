package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003608 Add 4, then reverse digits; start with 0.
 * @author Sean A. Irvine
 */
public class A003608 extends Sequence0 {

  private Z mA = Z.valueOf(-4);

  @Override
  public Z next() {
    mA = Functions.REVERSE.z(mA.add(4));
    return mA;
  }
}
