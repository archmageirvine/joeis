package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051883 a(n) is the smallest number such that the concatenation of a(1)a(2)a(3)...a(n) is divisible by n.
 * @author Sean A. Irvine
 */
public class A051883 extends Sequence1 {

  protected long mN = 0;
  protected Z mS = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return mS;
    }
    long k = 0;
    while (true) {
      final String m = mS.toString() + k;
      final Z c = new Z(m);
      if (c.mod(mN) == 0) {
        mS = c;
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}

