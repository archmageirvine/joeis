package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056038 Largest factorial k! such that (k!)^2 divides n!.
 * @author Sean A. Irvine
 */
public class A056038 extends Sequence0 {

  private int mN = -1;
  private int mK = 1;

  @Override
  public Z next() {
    final Z f = Functions.FACTORIAL.z(++mN);
    while (f.mod(Functions.FACTORIAL.z(mK).square()).isZero()) {
      ++mK;
    }
    return Functions.FACTORIAL.z(mK - 1);
  }
}
