package irvine.oeis.a162;
// manually triman/trian at 2021-10-31 19:06

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A162608 Triangle read by rows in which row n lists n+1 terms, starting with n!, such that the difference between successive terms is also equal to n!.
 * @author Georg Fischer
 */
public class A162608 extends Triangle {

  private Z mFact;

  @Override
  protected Z compute(final int n, final int k) {
    if (k == 0) {
      mFact = Functions.FACTORIAL.z(n);
      return mFact;
    } else {
      return get(n, k - 1).add(mFact);
    }
  }
}
