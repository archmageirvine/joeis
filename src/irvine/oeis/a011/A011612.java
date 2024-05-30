package irvine.oeis.a011;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011612 Legendre symbol (n,149).
 * @author Sean A. Irvine
 */
public class A011612 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.JACOBI.z(++mN, 149);
  }
}
