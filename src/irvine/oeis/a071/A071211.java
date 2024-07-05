package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071211 Triangular array T(n,k) read by rows, giving number of labeled free trees such that the root is smaller than all its children, with respect to the number n of vertices and to the label k of the root.
 * @author Sean A. Irvine
 */
public class A071211 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mN + 1).pow(mN - mM).multiply(Z.valueOf(mN).pow(mM)).multiply(mN - mM).divide(mN + 1).divide(mN);
  }
}
