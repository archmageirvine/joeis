package irvine.oeis.a394;

import irvine.math.group.SymmetricGroup;
import irvine.math.set.Permutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394412 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A394412 extends Sequence0 {

  // todo way too slow, used only to demonstrate initial terms

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final SymmetricGroup<Integer> s = SymmetricGroup.create(mN);
    long cnt = 0;
    for (final Permutation<Integer> x : s) {
      for (final Permutation<Integer> y : s) {
        if (y.compose(x).compose(y.inverse()).compose(x).compose(y).equals(x.compose(y).compose(x.inverse()).compose(y).compose(x))) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
