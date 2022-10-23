package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027679 When squared gives number composed of digits {2,4,8} with each of these digits appearing at least once.
 * @author Sean A. Irvine
 */
public class A027679 extends Sequence1 {

  private Z mN = Z.ZERO;

  private boolean is(Z n) {
    int seen = 0;
    while (!n.isZero()) {
      final long r = n.mod(10);
      if (r != 2 && r != 4 && r != 8) {
        return false;
      }
      seen |= 1 << r;
      n = n.divide(Z.TEN);
    }
    return seen == 276;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN.square())) {
        return mN;
      }
    }
  }
}
