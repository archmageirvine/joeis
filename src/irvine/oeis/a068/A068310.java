package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A068310 n^2 - 1 divided by its largest square divisor.
 * @author Sean A. Irvine
 */
public class A068310 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Functions.CORE.z(Z.valueOf(++mN).square().subtract(1));
  }
}

