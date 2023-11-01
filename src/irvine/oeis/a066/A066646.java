package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A066646 Arrange the permutations of {1..m} in lexicographic order. Sequence gives indices of permutations of orders 1 or 2.
 * @author Sean A. Irvine
 */
public class A066646 extends Sequence1 {

  private static final int PERM_SIZE = 24; // Way more than we can hope to enumerate
  private final Permutation mPerm = new Permutation(PERM_SIZE);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final int[] p = mPerm.next();
      if (Permutation.order(p).compareTo(Z.TWO) <= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
