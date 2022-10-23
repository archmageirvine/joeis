package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032577 Numbers k whose decimal representation, read as a base-23 value and divided by k, yields an integer.
 * @author Sean A. Irvine
 */
public class A032577 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (new Z(Long.toString(++mN), 23).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
