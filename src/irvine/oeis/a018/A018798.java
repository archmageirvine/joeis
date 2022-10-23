package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018798 Smallest 4th power that begins with n.
 * @author Sean A. Irvine
 */
public class A018798 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String target = String.valueOf(++mN);
    Z b = Z.NEG_ONE;
    while (true) {
      b = b.add(1);
      final Z q = b.pow(4);
      if (q.toString().startsWith(target)) {
        return q;
      }
    }
  }
}
