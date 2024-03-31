package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069036.
 * @author Sean A. Irvine
 */
public class A069036 extends Sequence0 {

  private static final Z[] SMALL = {Z.TEN, Z.TWO, Z.FOUR};
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return SMALL[(int) mN];
    }
    final long s = (1L << mN) - 8;
    final StringBuilder sb = new StringBuilder();
    final long r = s % 9;
    sb.append(r);
    sb.append("9".repeat((int) ((s - r) / 9)));
    sb.append('8');
    return new Z(sb);
  }
}

