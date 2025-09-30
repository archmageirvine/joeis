package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A080758.
 * @author Sean A. Irvine
 */
public class A080768 extends A080766 {

  @Override
  protected Z select(final long n, final long m) {
    return Z.valueOf(n).multiply(m).divide(n - m).divide(Functions.UPHI.l(n));
  }
}
