package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018798.
 * @author Sean A. Irvine
 */
public class A018798 implements Sequence {

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
