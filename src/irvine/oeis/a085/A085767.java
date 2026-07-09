package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000326;

/**
 * A085767 Smallest m such that n divides the pentagonal number A000326(m).
 * @author Sean A. Irvine
 */
public class A085767 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence s = new A000326().skip();
    long m = 0;
    while (true) {
      ++m;
      if (s.next().mod(mN) == 0) {
        return Z.valueOf(m);
      }
    }
  }
}
