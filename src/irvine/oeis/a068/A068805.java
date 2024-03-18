package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;
import irvine.util.array.DynamicLongArray;

/**
 * A068805 Suppose the integer m has k decimal digits; make a list of the k! strings obtained by permuting the digits in all possible ways; discard any leading zeros; count distinct squares in the list (A062892); a(n) = smallest m that yields n squares.
 * @author Sean A. Irvine
 */
public class A068805 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final Permutation perm = Permutation.permuter(Z.valueOf(++mM));
      int[] p;
      int cnt = 0;
      while ((p = perm.next()) != null) {
        if (Permutation.permToZ(p).isSquare()) {
          ++cnt;
        }
      }
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
