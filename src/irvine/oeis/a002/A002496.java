package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002496 Primes of the form k^2 + 1.
 * @author Sean A. Irvine
 */
public class A002496 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square().add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
