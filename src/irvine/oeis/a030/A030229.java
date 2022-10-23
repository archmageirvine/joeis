package irvine.oeis.a030;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030229 Numbers that are the product of an even number of distinct primes.
 * @author Sean A. Irvine
 */
public class A030229 extends Sequence1 {

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
