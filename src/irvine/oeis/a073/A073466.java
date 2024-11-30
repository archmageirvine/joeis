package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073451.
 * @author Sean A. Irvine
 */
public class A073466 extends Sequence0 {

  private int mN = 2;
  private int mM = 2;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 2;
    }
    return Functions.TRIANGULAR.z(mN).mod(Functions.TRIANGULAR.z(mM));
  }
}
