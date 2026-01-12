package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a071.A071148;

/**
 * A391806 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A391806 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence s = new A071148();
    long k = 0;
    while (true) {
      ++k;
      if (s.next().mod(mN) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
