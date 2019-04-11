package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008904 <code>a(n) =</code> final nonzero digit of <code>n!</code>.
 * @author Sean A. Irvine
 */
public class A008904 implements Sequence {

  // After W. Bomfin

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    int q = 0;
    int t = 0;
    int x = 0;
    final String s = Long.toString(mN, 5);
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
}
