package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069037 Smallest multiple of 4 with digit sum 4^n.
 * @author Sean A. Irvine
 */
public class A069037 extends Sequence0 {

  private static final Z[] SMALL = {Z.valueOf(100), Z.FOUR};
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return SMALL[(int) mN];
    }
    final long s = (1L << (2 * mN)) - 16;
    final StringBuilder sb = new StringBuilder();
    final long r = s % 9;
    sb.append(r);
    sb.append("9".repeat((int) ((s - r) / 9)));
    sb.append("88");
    return new Z(sb);
  }
}

