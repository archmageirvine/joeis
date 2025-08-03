package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046848 Primes of form k*2^k+(k-1).
 * @author Sean A. Irvine
 */
public class A046848 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).shiftLeft(mN).add(mN - 1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
