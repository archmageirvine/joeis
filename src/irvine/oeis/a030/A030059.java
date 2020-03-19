package irvine.oeis.a030;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030059 Numbers that are the product of an odd number of distinct primes.
 * @author Sean A. Irvine
 */
public class A030059 implements Sequence {

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
