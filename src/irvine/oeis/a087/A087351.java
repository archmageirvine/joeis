package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087351 Smallest noncomposite number which is the concatenation of n successive squares, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A087351 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 9 == 0) {
      return Z.ZERO;
    }
    if (mN == 1) {
      return Z.ONE;
    }
    long s = 0;
    while (true) {
      ++s;
      final StringBuilder sb = new StringBuilder();
      for (long k = 0, t = s; k < mN; ++k, ++t) {
        sb.append(Z.valueOf(t).square());
      }
      final Z concat = new Z(sb);
      if (concat.isProbablePrime()) {
        return concat;
      }
    }
  }
}
