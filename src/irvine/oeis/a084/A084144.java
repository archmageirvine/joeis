package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A084144 First digit occurring consecutively exactly n times in Pi's decimal expansion.
 * @author Sean A. Irvine
 */
public class A084144 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence pi = new A000796();
    Z d = pi.next();
    long cnt = 1;
    while (true) {
      final Z t = pi.next();
      if (t.equals(d)) {
        ++cnt;
      } else if (cnt == mN) {
        return d;
      } else {
        d = t;
        cnt = 1;
      }
    }
  }
}

