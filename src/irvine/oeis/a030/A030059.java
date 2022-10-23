package irvine.oeis.a030;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030059 Numbers that are the product of an odd number of distinct primes.
 * @author Sean A. Irvine
 */
public class A030059 extends Sequence1 {

  protected long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Mobius.mobius(++mN) == -1) {
        return Z.valueOf(mN);
      }
    }
  }
}
