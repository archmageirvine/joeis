package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a064.A064628;

/**
 * A070964.
 * @author Sean A. Irvine
 */
public class A070981 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence seq = new A064628().skip();
    long k = 0;
    while (true) {
      ++k;
      if (seq.next().mod(mN) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
