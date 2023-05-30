package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008904 a(n) is the final nonzero digit of n!.
 * @author Sean A. Irvine
 */
public class A008904 extends Sequence0 {

  // After W. Bomfin

  private long mN = -1;

  protected Z digit(final Z n) {
    int q = 0;
    int t = 0;
    int x = 0;
    final String s = n.toString(5);
    for (int i = 0; i < s.length() - 1; ++i) {
      final int ai = s.charAt(i) - '0';
      q += ai;
      x += q;
      if ((ai & 1) == 0) {
        t += ai;
      }
    }
    final int a0 = s.charAt(s.length() - 1) - '0';
    if ((a0 & 1) == 0) {
      t += a0;
    }
    final int z = (x + t / 2) & 3;
    return z == 0 ? Z.SIX : Z.ONE.shiftLeft(z);
  }

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    return digit(Z.valueOf(mN));
  }
}
