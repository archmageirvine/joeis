package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086509 Numbers n such that p=n^2+2, p+2, p+6, p+8 and p+12 are five consecutive primes.
 * @author Sean A. Irvine
 */
public class A086509 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square().add(2);
      if (t.isProbablePrime() && t.add(2).isProbablePrime() && t.add(6).isProbablePrime() && t.add(8).isProbablePrime() && t.add(12).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

