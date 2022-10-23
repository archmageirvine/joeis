package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045874 a(1)=1, a(n) is smallest multiple of n with same beginning as a(n-1).
 * @author Sean A. Irvine
 */
public class A045874 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1 && mA.mod(mN) != 0) {
      Z m = Z.ONE;
      while (true) {
        m = m.multiply(10);
        final Z t = mA.multiply(m);
        final long r = t.mod(mN);
        if (r == 0) {
          mA = t;
          break;
        }
        final long add = mN - r;
        if (Z.valueOf(add).compareTo(m) < 0) {
          mA = t.add(add);
          break;
        }
      }
    }
    return mA;
  }
}
