package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060603 Number of ways of expressing an n-cycle in the symmetric group S_n as a product of n+1 transpositions.
 * @author Sean A. Irvine
 */
public class A060603 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN + 1).multiply((long) mN * mN - 1).divide(24);
  }
}
