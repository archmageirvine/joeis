package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051347 Numbers that are the sum of two (possibly negative) cubes in at least 2 ways.
 * @author Sean A. Irvine
 */
public class A051347 implements Sequence {

  private long mN = 90;

  protected int ways() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      long cnt = 0;
      for (long a = 0; 3 * a * a - 3 * a <= mN; ++a) {
        final Z a3 = Z.valueOf(a).pow(3);
        final Z t = n.subtract(a3);
        final long r = t.root(3).longValueExact();
        if (t.auxiliary() == 1 && r <= a && ++cnt >= ways()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
