package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035222 Number of squares that appear as substrings in n.
 * @author Sean A. Irvine
 */
public class A035222 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long c = 0;
    for (long k = 0; k * k <= mN; ++k) {
      final String k2 = String.valueOf(k * k);
      for (int t = s.indexOf(k2); t >= 0; t = s.indexOf(k2, t + 1)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

