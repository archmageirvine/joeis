package irvine.oeis.a071;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071209 Triangular array T(n,k) read by rows, giving number of labeled free trees such that the root is smaller than all its children, with respect to the number n of vertices and to the size k of the subtree rooted at the vertex labeled by 1.
 * @author Sean A. Irvine
 */
public class A071209 extends Sequence1 {

  private int mN = 0;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM > mN + 1) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mN, mM - 1).multiply(Z.valueOf(mM).pow(mM - 1)).multiply(Z.valueOf(mN - mM).pow(mN + 1 - mM)).divide(mM);
  }
}

