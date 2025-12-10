package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082466 Least k&gt;=1 such that n^2+kn-1 and n^2+kn+1 are twin primes.
 * @author Sean A. Irvine
 */
public class A082466 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z n2 = n.square();
    long k = 0;
    while (true) {
      final Z t = n2.add(n.multiply(++k));
      if (t.add(1).isProbablePrime() && t.subtract(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

