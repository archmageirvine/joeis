package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037896 Primes of the form k^4 + 1.
 * @author Sean A. Irvine
 */
public class A037896 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z m = Z.valueOf(++mN).pow(4).add(1);
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}
