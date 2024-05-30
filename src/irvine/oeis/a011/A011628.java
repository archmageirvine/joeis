package irvine.oeis.a011;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011628 Legendre symbol (n,233).
 * @author Sean A. Irvine
 */
public class A011628 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.JACOBI.z(++mN, 233);
  }
}
