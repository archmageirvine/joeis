package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390525 a(n) = A000217(n)*A000045(n).
 * @author Sean A. Irvine
 */
public class A390525 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(++mN).multiply(Functions.TRIANGULAR.z(mN));
  }
}

