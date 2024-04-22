package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005817 a(n) = C(floor(n/2 + 1/2))*C(floor(n/2 + 1)) where C(i) = Catalan numbers A000108.
 * @author Sean A. Irvine
 */
public class A005817 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.CATALAN.z((long) ((mN + 1) / 2)).multiply(Functions.CATALAN.z((long) (mN / 2 + 1)));
  }
}
