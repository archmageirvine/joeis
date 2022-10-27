package irvine.oeis.a060;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;

/**
 * A060128.
 * @author Sean A. Irvine
 */
public class A060128 extends A060117 {

  private int mN = -1;

  @Override
  public Z next() {
    final IntegerPermutation perm = permUnrank3R(++mN);
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
