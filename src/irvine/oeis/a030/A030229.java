package irvine.oeis.a030;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030229 Product of an even number of distinct primes (including 1).
 * @author Sean A. Irvine
 */
public class A030229 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Mobius.mobius(++mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
