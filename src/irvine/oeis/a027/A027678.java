package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027678 Squares composed of digits <code>{2,4,8}</code>.
 * @author Sean A. Irvine
 */
public class A027678 implements Sequence {

  private Z mN = Z.ZERO;

  private boolean is(Z n) {
    while (!Z.ZERO.equals(n)) {
      final long r = n.mod(10);
      if (r != 2 && r != 4 && r != 8) {
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
      final Z s = mN.square();
      if (is(s)) {
        return s;
      }
    }
  }
}
