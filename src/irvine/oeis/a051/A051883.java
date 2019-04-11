package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051883 <code>a(n)</code> is the smallest number such that the concatenation of <code>a(1)a(2)a(3)</code>...a(n) is divisible by n.
 * @author Sean A. Irvine
 */
public class A051883 implements Sequence {

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

