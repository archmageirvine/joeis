package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087074 For n &gt; 0, 0 &lt;= k &lt;= n^2, T(n,k) is the number of rotationally and reflectively distinct n X n arrays that contain the numbers 1 through k once each and n^2-k zeros.
 * @author Sean A. Irvine
 */
public class A087074 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN * mN) {
      ++mN;
      mM = 0;
    }
    if ((mN & 1) == 0) {
      return Functions.FALLING_FACTORIAL.z(mN * mN, mM).add(Functions.FALLING_FACTORIAL.z(mN, mM).multiply2()).add(Functions.FALLING_FACTORIAL.z(0, mM).multiply(5)).divide(8);
    } else {
      return Functions.FALLING_FACTORIAL.z(mN * mN, mM).add(Functions.FALLING_FACTORIAL.z(mN, mM).multiply(4)).add(Functions.FALLING_FACTORIAL.z(1, mM).multiply(3)).divide(8);
    }
  }
}

