package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056961 Base 12 reversal of n (written in base 10).
 * @author Sean A. Irvine
 */
public class A056961 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Functions.REVERSE.z(12, mN);
  }
}
