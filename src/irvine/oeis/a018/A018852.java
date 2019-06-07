package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018852 <code>a(n)^3</code> is smallest cube beginning with <code>n</code>.
 * @author Sean A. Irvine
 */
public class A018852 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String target = String.valueOf(++mN);
    Z b = Z.NEG_ONE;
    while (true) {
      b = b.add(1);
      if (b.pow(3).toString().startsWith(target)) {
        return b;
      }
    }
  }
}
