package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056039 Largest k such that (k!)^2 divides n!.
 * @author Sean A. Irvine
 */
public class A056039 extends Sequence1 {

  private int mN = 0;
  private int mK = 1;

  @Override
  public Z next() {
    final Z f = Functions.FACTORIAL.z(++mN);
    while (f.mod(Functions.FACTORIAL.z(mK).square()).isZero()) {
      ++mK;
    }
    return Z.valueOf(mK - 1);
  }
}
