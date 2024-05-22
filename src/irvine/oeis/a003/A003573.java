package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003573 Order of 4 mod 4n+1.
 * @author Sean A. Irvine
 */
public class A003573 extends Sequence0 {

  private long mN = -3;

  @Override
  public Z next() {
    mN += 4;
    return Functions.ORDER.z(mN, Z.FOUR);
  }
}
