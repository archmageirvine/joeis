package irvine.oeis.a071;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071207 Triangular array T(n,k) read by rows, giving number of rooted trees on the vertex set {1..n+1} where k children of the root have a label smaller than the label of the root.
 * @author Sean A. Irvine
 */
public class A071207 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM).multiply(Z.valueOf(mN).pow(mN - mM));
  }
}
