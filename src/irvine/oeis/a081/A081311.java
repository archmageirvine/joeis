package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003586;

/**
 * A081311 Numbers that can be written as sum of a prime and an 3-smooth number.
 * @author Sean A. Irvine
 */
public class A081311 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Sequence t = new A003586();
      while (true) {
        final Z u = mN.subtract(t.next());
        if (u.signum() <= 0) {
          break;
        }
        if (u.isProbablePrime()) {
          return mN;
        }
      }
    }
  }
}

