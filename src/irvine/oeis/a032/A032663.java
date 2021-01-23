package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032663 Primes that are the smallest decimal concatenations of n with n + (0,1,2,3,...).
 * @author Sean A. Irvine
 */
public class A032663 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long l = 0;
    while (true) {
      final Z concat = new Z(String.valueOf(++l) + (mN + l));
      if (concat.isProbablePrime()) {
        return concat;
      }
    }
  }
}
