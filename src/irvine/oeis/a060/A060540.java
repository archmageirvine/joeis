package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.triangle.DirectArray;

/**
 * A060540 Square array read by antidiagonals downwards: T(n,k) = (n*k)!/(k!^n*n!), (n&gt;=1, k&gt;=1), the number of ways of dividing nk labeled items into n unlabeled boxes with k items in each box.
 * @author Sean A. Irvine
 */
public class A060540 extends Sequence1 implements DirectArray {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z a(final int n, final int m) {
    return Functions.FACTORIAL.z(n * m)
      .divide(Functions.FACTORIAL.z(m).pow(n))
      .divide(Functions.FACTORIAL.z(n));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return a(mM, mN + 1 - mM);
  }

}
