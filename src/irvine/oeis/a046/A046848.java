package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046848 Primes of form n*2^n+(n-1).
 * @author Sean A. Irvine
 */
public class A046848 implements Sequence {

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
