package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071208 Triangular array T(n,k) read by rows, giving number of labeled free trees such that the root is smaller than all its children, with respect to the number n of vertices and to the number k of decreasing edges.
 * @author Sean A. Irvine
 */
public class A071208 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(mM + 1, mN, k -> Z.NEG_ONE.pow(mM + 1).multiply(Binomial.binomial(k, mM + 1)).multiply(Functions.STIRLING1.z(mN + 1, mN + 1 - k)).multiply(Z.valueOf(mN).pow(mN - k)));
  }
}

