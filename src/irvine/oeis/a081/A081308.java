package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003586;

/**
 * A081308 Number of ways to write n as sum of a prime and an 3-smooth number.
 * @author Sean A. Irvine
 */
public class A081308 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    final Sequence t = new A003586();
    while (true) {
      final Z u = mN.subtract(t.next());
      if (u.signum() <= 0) {
        return Z.valueOf(cnt);
      }
      if (u.isProbablePrime()) {
        ++cnt;
      }
    }
  }
}

