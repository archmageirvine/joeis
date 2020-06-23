package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032581 Numbers n such that <code>A174141(n)</code> is divisible by <code>n</code>.
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
