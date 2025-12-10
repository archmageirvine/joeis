package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082465 Least k&gt;=1 such that n^2+kn+1 is prime.
 * @author Sean A. Irvine
 */
public class A082465 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z n2 = n.square();
    long k = 0;
    while (true) {
      if (n2.add(n.multiply(++k)).add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

