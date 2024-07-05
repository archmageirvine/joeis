package irvine.oeis.a071;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071210 Triangular array T(n,k) read by rows, giving number of labeled free trees such that the root is smaller than all its children, with respect to the number n of vertices and to the degree k of the root.
 * @author Sean A. Irvine
 */
public class A071210 extends Sequence1 {

  private int mN = 0;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mN + 1, mM + 1).multiply(Z.valueOf(mN).pow(mN - mM)).multiply(mM).divide(mN);
  }
}
