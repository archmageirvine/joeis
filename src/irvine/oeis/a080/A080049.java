package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A080049 Operation count to create all permutations of n distinct elements using Algorithm L (lexicographic permutation generation) from Knuth's The Art of Computer Programming, Vol. 4, chapter 7.2.1.2. Sequence gives number of interchange operations in step L4.
 * @author Sean A. Irvine
 */
public class A080049 extends Sequence2 {

  private long mN = 1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 2) {
      mA = mA.multiply(mN).add((mN - 1) * ((mN - 1) / 2));
    }
    return mA;
  }
}
