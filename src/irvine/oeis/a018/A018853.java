package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018853 a(n)^4 is smallest fourth power beginning with n.
 * @author Sean A. Irvine
 */
public class A018853 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String target = String.valueOf(++mN);
    Z b = Z.NEG_ONE;
    while (true) {
      b = b.add(1);
      if (b.pow(4).toString().startsWith(target)) {
        return b;
      }
    }
  }
}
