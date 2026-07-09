package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000292;

/**
 * A085766 Smallest m such that n divides the tetrahedral number A000292(m+1).
 * @author Sean A. Irvine
 */
public class A085766 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence s = new A000292().skip(2);
    long m = 0;
    while (true) {
      ++m;
      if (s.next().mod(mN) == 0) {
        return Z.valueOf(m);
      }
    }
  }
}
