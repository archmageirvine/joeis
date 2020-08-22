package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032581 Numbers n such that A174141(n) is divisible by n.
 * @author Sean A. Irvine
 */
public class A032581 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (new Z(Long.toString(++mN), 25).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
