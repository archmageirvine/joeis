package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027679 When squared gives number composed of digits <code>{2,4,8}</code> with each of these digits appearing at least once.
 * @author Sean A. Irvine
 */
public class A027679 implements Sequence {

  private Z mN = Z.ZERO;

  private boolean is(Z n) {
    int seen = 0;
    while (!Z.ZERO.equals(n)) {
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
