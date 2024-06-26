package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005372 a(n) = L(L(n+1)+1), where L(n) are Lucas numbers A000032.
 * @author Sean A. Irvine
 */
public class A005372 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    return Functions.LUCAS.z(Functions.LUCAS.l(++mN) + 1);
  }
}
