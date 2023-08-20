package irvine.oeis.a060;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060128 a(n) is the number of disjoint cycles (excluding 1-cycles, i.e., fixed elements) in the n-th permutation of A060117 and A060118.
 * @author Sean A. Irvine
 */
public class A060128 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int r = ++mN;
    final IntegerPermutation perm = IntegerPermutation.permUnrank3R(r);
    final boolean[] seen = new boolean[perm.size()];
    int cycles = 0;
    for (int k = 0; k < perm.size(); ++k) {
      if (!seen[k]) {
        if (perm.image(k) != k) {
          ++cycles;
          int j = k;
          do {
            seen[j] = true;
            j = perm.image(j);
          } while (j != k);
        }
      }
    }
    return Z.valueOf(cycles);
  }
}
