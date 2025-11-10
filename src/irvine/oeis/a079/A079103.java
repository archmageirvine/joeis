package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079103 a(n) = Catalan(n)^(2*n-2).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A079103 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.CATALAN.z(++mN).pow(2L * mN - 2);
  }
}
