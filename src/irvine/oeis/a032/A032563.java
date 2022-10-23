package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032563 Numbers k such that A102489(k) is divisible by k.
 * @author Sean A. Irvine
 */
public class A032563 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (new Z(Long.toString(++mN), 16).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
