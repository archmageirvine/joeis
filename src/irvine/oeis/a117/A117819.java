package irvine.oeis.a117;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A117819 Final digit d of n is in the sequence iff d is prime or n is prime.
 * @author Georg Fischer
 */
public class A117819 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long d = mN % 10;
      if (d == 2 || d == 3 || d == 5 || d == 7 || Z.valueOf(mN).isProbablePrime()) {
        return Z.valueOf(d);
      }
    }
  }
}
