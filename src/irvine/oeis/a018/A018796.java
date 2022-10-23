package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018796 Smallest square that begins with n.
 * @author Sean A. Irvine
 */
public class A018796 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String target = String.valueOf(++mN);
    Z b = Z.NEG_ONE;
    while (true) {
      b = b.add(1);
      final Z s = b.square();
      if (s.toString().startsWith(target)) {
        return s;
      }
    }
  }
}
