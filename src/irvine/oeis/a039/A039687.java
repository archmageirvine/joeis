package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039687 Primes of form 3*2^n+1.
 * @author Sean A. Irvine
 */
public class A039687 extends Sequence1 {

  private Z mM = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mM = mM.shiftLeft(1);
      final Z t = mM.add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
