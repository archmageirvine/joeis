package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A051045 Number of distinct resistances possible for n resistors with resistances 1, 2, ..., n, each connected in series or parallel to the previous one.
 * @author Sean A. Irvine
 */
public class A051045 implements Sequence {

  // Brute force, all permutations, all arrangements

  private int mN = 0;

  @Override
  public Z next() {
    final Permutation perm = new Permutation(++mN);
    final TreeSet<Q> values = new TreeSet<>();
    final int lim = 1 << mN;
    int[] p;
    while ((p = perm.next()) != null) {
      for (int arrangement = 0; arrangement < lim; ++arrangement) {
        Q resistance = new Q(p[0] + 1);
        for (int k = 1; k < p.length; ++k) {
          if ((arrangement & (1 << k)) == 0) {
            // parallel
            resistance = resistance.reciprocal().add(new Q(1, p[k] + 1)).reciprocal();
          } else {
            // series
            resistance = resistance.add(new Q(p[k] + 1));
          }
        }
        values.add(resistance);
      }
    }
    return Z.valueOf(values.size());
  }
}
