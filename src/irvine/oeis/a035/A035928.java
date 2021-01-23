package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a036.A036044;

/**
 * A035928 Numbers n such that BCR(n) = n, where BCR = binary-complement-and-reverse = take one's complement then reverse bit order.
 * @author Sean A. Irvine
 */
public class A035928 extends A036044 {

  @Override
  public Z next() {
    while (true) {
      final long v = super.next().longValueExact();
      if (v == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

