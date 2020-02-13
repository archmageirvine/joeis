package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028880 Primes of the form <code>n^2 - 6</code>.
 * @author Sean A. Irvine
 */
public class A028880 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().subtract(6);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
