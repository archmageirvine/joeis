package irvine.oeis.a069;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069725 Number of nonisomorphic unrooted unicursal planar maps with n edges and two vertices of valency 1 (unicursal means that exactly two vertices are of odd valency; there is an Eulerian path).
 * @author Sean A. Irvine
 */
public class A069725 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    final long m = (mN + 1) / 2;
    return Binomial.binomial(2 * mN - 2, mN - 1).shiftLeft(mN - 3).divide(mN).add(Binomial.binomial(2 * m - 2, m - 1).shiftLeft(m - 3));
  }
}

