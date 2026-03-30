package irvine.oeis.a394;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A394504 allocated for Vincenzo Manto.
 * @author Sean A. Irvine
 */
public class A394504 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 1;
  {
    mA.add(Z.ZERO);
  }

  private void search(final int[] suffix) {
    if (suffix.length == mN) {
      if (suffix[0] != 0) {
        mA.add(Permutation.permToZ(suffix));
      }
      return;
    }
    for (int d = 0; d < 10; ++d) {
      int cnt = 0;
      for (final int x : suffix) {
        if (x < d) {
          ++cnt;
        }
      }
      if (d == cnt) {
        final int[] s = new int[suffix.length + 1];
        s[0] = d;
        System.arraycopy(suffix, 0, s, 1, suffix.length);
        search(s);
      }
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mN;
      search(new int[] {0});
    }
    return mA.pollFirst();
  }
}
