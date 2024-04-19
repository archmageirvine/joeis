package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046792 Triangle of numbers where k-th row contains (ij)!/(i!j!) with i+j = k+1, 1 &lt;= i &lt;= k.
 * @author Sean A. Irvine
 */
public class A046792 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Functions.FACTORIAL.z(mM * (mN + 1 - mM)).divide(Functions.FACTORIAL.z(mM)).divide(Functions.FACTORIAL.z(mN + 1 - mM));
  }
}

