package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A082268 Triangle read by rows in which the n-th row contains the numbers coprime to n that are made of nonzero digits and having a digit sum of n. An empty row is represented by a 0.
 * @author Sean A. Irvine
 */
public class A082268 extends Sequence1 {

  private int mN = 0;
  private TreeSet<Z> mRow = new TreeSet<>();

  private TreeSet<Z> buildRow(final int n) {
    final TreeSet<Z> res = new TreeSet<>();
    if (n == 1) {
      res.add(Z.ONE);
      return res;
    }
    final IntegerPartition part = new IntegerPartition(n, 9);
    int[] p;
    while ((p = part.next()) != null) {
      final Permutation perm = new Permutation(p);
      int[] q;
      while ((q = perm.next()) != null) {
        final Z t = Permutation.permToZ(q);
        if (Functions.GCD.z(t, mN).isOne()) {
          res.add(t);
        }
      }
    }
    if (res.isEmpty()) {
      res.add(Z.ZERO);
    }
    return res;
  }

  @Override
  public Z next() {
    if (mRow.isEmpty()) {
      mRow = buildRow(++mN);
    }
    return mRow.pollFirst();
  }
}
