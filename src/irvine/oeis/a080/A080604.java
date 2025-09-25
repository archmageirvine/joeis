package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080604 Triangular array of hypotenuses of right triangles with integer legs: T(n,k) = round(sqrt(n^2 + k^2)), 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A080604 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return CR.valueOf(mN * mN + mM * mM).sqrt().round();
  }
}
