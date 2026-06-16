package irvine.oeis.a186;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A186752 Length of minimum representation of the permutation [n,n-1,...,1] as the product of transpositions (1,2) and left and right rotations (1,2,...,n).
 * @author Sean A. Irvine
 */
public class A186752 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN <= 3 ? Z.valueOf(mN - 1) : Z.valueOf(mN).multiply(mN - 1).divide2().subtract(2);
  }
}
