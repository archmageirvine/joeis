package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068701.
 * @author Sean A. Irvine
 */
public class A068707 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    long k = 0;
    while (true) {
      k += 2;
      sb.setLength(0);
      for (long j = 0, i = k; j < mN; ++j, i += 2) {
        sb.append(i);
      }
      sb.append('1');
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
