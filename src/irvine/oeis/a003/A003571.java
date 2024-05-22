package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003571 Order of 3 mod 3n+1.
 * @author Sean A. Irvine
 */
public class A003571 extends Sequence0 {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 3;
    return Functions.ORDER.z(mN, Z.THREE);
  }
}
