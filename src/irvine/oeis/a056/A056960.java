package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056960 Base 11 reversal of n (written in base 10).
 * @author Sean A. Irvine
 */
public class A056960 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Functions.REVERSE.z(11, mN);
  }
}
