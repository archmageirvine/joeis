package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027675 When squared gives number composed of digits {1,4,9}.
 * @author Sean A. Irvine
 */
public class A027675 implements Sequence {

  private Z mN = Z.ZERO;

  private boolean is(Z n) {
    while (!n.isZero()) {
      final long r = n.mod(10);
      if (r != 1 && r != 4 && r != 9) {
        return false;
      }
      n = n.divide(Z.TEN);
    }
    return true;
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
