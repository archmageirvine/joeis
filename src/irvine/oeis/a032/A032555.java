package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032555 Numbers k whose decimal representation, read as a base-12 value and divided by k, yields an integer.
 * @author Sean A. Irvine
 */
public class A032555 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (new Z(Long.toString(++mN), 12).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
