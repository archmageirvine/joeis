package irvine.oeis.a280;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a071.A071562;

/**
 * A081418.
 * @author Sean A. Irvine
 */
public class A280295 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence s = new A071562();
    Z t = s.next();
    long m = 0;
    while (true) {
      ++m;
      final Z u = t;
      t = s.next();
      if (t.subtract(u).longValueExact() == mN) {
        return u;
      }
    }
  }
}
