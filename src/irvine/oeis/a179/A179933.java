package irvine.oeis.a179;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A179933 n replaced by a list of the distinct positive integers that can be formed with the decimal digits of n.
 * @author Sean A. Irvine
 */
public class A179933 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Permutation perm = Permutation.permuter(Z.valueOf(++mN));
      int[] p;
      while ((p = perm.next()) != null) {
        long r = 0;
        for (final int v : p) {
          r *= 10;
          r += v;
          if (r != 0) {
            mA.add(r);
          }
        }
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
