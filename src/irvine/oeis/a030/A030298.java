package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A030298 List of permutations of 1,2,3,...,n for n=1,2,3,..., in lexicographic order.
 * @author Sean A. Irvine
 */
public class A030298 implements Sequence {

  private Permutation mPerm = new Permutation(1);
  private int[] mP = new int[0];
  private int mPos = 0;
  private int mN = 1;

  @Override
  public Z next() {
    if (++mPos >= mP.length) {
      mPos = 0;
      mP = mPerm.next();
      if (mP == null) {
        mPerm = new Permutation(++mN);
        mP = mPerm.next();
      }
    }
    return Z.valueOf(mP[mPos] + 1);
  }
}

