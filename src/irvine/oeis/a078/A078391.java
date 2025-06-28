package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078391 Triangle read by rows: T(n,k) = Catalan(k)*Catalan(n-k).
 * @author Sean A. Irvine
 */
public class A078391 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Functions.CATALAN.z(mM).multiply(Functions.CATALAN.z(mN - mM));
  }
}

