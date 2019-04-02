package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.GaussianIntegers;
import irvine.util.Pair;

/**
 * A002607 Glaisher's chi_8(n).
 * @author Sean A. Irvine
 */
public class A002607 implements Sequence {

  private static final GaussianIntegers GI = GaussianIntegers.SINGLETON;
  private int mN = 0;

  @Override
  @SuppressWarnings("unchecked")
  public Z next() {
    final int m = (int) Math.sqrt(++mN);
    Pair<Z, Z> sum = GI.zero();
    for (int j = -m; j <= m; ++j) {
      final int j2 = j * j;
      for (int k = -m; k <= m; ++k) {
        final int pos = j2 + k * k;
        if (pos == mN) {
          final Pair<Z, Z> jk = new Pair<>(Z.valueOf(j), Z.valueOf(k));
          final Pair<Z, Z> c = GI.pow(jk, 8);
          sum = GI.add(sum, c);
        }
      }
    }
    assert Z.ZERO.equals(GI.im(sum));
    return GI.re(sum).divide(4);
  }
}
