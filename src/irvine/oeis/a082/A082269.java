package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A082269 Number of terms in row n of A082268.
 * @author Sean A. Irvine
 */
public class A082269 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long cnt = 0;
    final IntegerPartition part = new IntegerPartition(mN, 9);
    int[] p;
    while ((p = part.next()) != null) {
      final Permutation perm = new Permutation(p);
      int[] q;
      while ((q = perm.next()) != null) {
        final Z t = Permutation.permToZ(q);
        if (Functions.GCD.z(t, mN).isOne()) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
