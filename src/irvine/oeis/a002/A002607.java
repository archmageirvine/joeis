package irvine.oeis.a002;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence1;

/**
 * A002607 Glaisher's chi_8(n).
 * @author Sean A. Irvine
 */
public class A002607 extends Sequence1 {

  private static final GaussianIntegers GI = GaussianIntegers.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    final int m = (int) Math.sqrt(++mN);
    Zi sum = GI.zero();
    for (int j = -m; j <= m; ++j) {
      final int j2 = j * j;
      for (int k = -m; k <= m; ++k) {
        final int pos = j2 + k * k;
        if (pos == mN) {
          final Zi jk = new Zi(j, k);
          final Zi c = GI.pow(jk, 8);
          sum = GI.add(sum, c);
        }
      }
    }
    assert GI.im(sum).isZero();
    return GI.re(sum).divide(4);
  }
}
