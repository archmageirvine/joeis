package irvine.oeis.a381;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A381975 Number of ways for n competitors to rank in a competition in which each match has 4 possible outcomes in which each competitor gains 0, 1, 2 or 3 points.
 * @author Sean A. Irvine
 */
public class A381975 extends Sequence0 {

  private int mN = -1;

  private boolean is(final int[] f) {
    for (int x = 0; x < f.length; ++x) {
      if (f[f[f[x]]] < x) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    final Bumper bump = BumperFactory.range(0, mN - 1);
    final int[] f = new int[mN];
    do {
      if (is(f)) {
        ++count;
      }
    } while (bump.bump(f));
    return Z.valueOf(count);
  }
}
