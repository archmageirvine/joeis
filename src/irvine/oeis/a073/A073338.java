package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073259.
 * @author Sean A. Irvine
 */
public class A073338 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (n.square().multiply(4).subtract(10 * mN).add(7).isProbablePrime()) {
        return n;
      }
    }
  }
}

