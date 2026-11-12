package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087345 Smallest prime which is a concatenation of n successive triangular numbers, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A087345 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 9 == 0) {
      return Z.ZERO;
    }
    long s = 0;
    while (true) {
      ++s;
      final StringBuilder sb = new StringBuilder();
      for (long k = 0, t = s; k < mN; ++k, ++t) {
        sb.append(Functions.TRIANGULAR.z(t));
      }
      final Z concat = new Z(sb);
      if (concat.isProbablePrime()) {
        return concat;
      }
    }
  }
}

