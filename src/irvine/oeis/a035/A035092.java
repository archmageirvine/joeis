package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035092.
 * @author Sean A. Irvine
 */
public class A035092 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z s = Z.valueOf(++mN).square();
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      if (k.multiply(s).add(1).isProbablePrime()) {
        return k;
      }
    }
  }
}
