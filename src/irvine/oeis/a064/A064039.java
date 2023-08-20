package irvine.oeis.a064;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a060.A060496;

/**
 * A064039 Reversed inversion vectors for the permutations of A060117, presented as pseudo-decimal numbers.
 * @author Sean A. Irvine
 */
public class A064039 extends Sequence1 {

  private int mN = -1;

  private int[] inversionVector(final IntegerPermutation p) {
    final int n = p.size();
    final int[] a = new int[n];
    for (int i = 1; i < n; ++i) {
      int c = 0;
      for (int j = 0; j < i; ++j) {
        if (p.image(j) > p.image(i)) {
          ++c;
        }
      }
      a[i - 1] = c;
    }
    return a;
  }

  @Override
  public Z next() {
    return A060496.toZ(inversionVector(IntegerPermutation.permUnrank3R(++mN)));
  }
}
