package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A070935 Largest proper divisor of n^2.
 * @author Sean A. Irvine
 */
public class A070935 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).square().divide(Functions.LPF.l(mN));
  }
}
