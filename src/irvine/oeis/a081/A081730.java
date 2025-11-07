package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000364;

/**
 * A081730 Numbers k such that the k-th Euler number == 1 (mod k).
 * @author Sean A. Irvine
 */
public class A081730 extends Sequence1 {

  private final Sequence mEuler = new A000364().skip();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mEuler.next().mod(++mN) == 1 % mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
