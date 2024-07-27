package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071546 Smallest integer &gt; 1 of the form (k^2+1)/(n^2+1).
 * @author Sean A. Irvine
 */
public class A071546 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long s = ++mN * mN + 1;
    long m = mN;
    while (true) {
      final long v = ++m * m + 1;
      if (v % s == 0) {
        return Z.valueOf(v / s);
      }
    }
  }
}

