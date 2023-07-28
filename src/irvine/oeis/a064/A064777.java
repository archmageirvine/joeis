package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000720;

/**
 * A064777 Numbers k such that prime(k) - pi(k) is divisible by k.
 * @author Sean A. Irvine
 */
public class A064777 extends Sequence1 {

  private final Sequence mPrime = new A000040();
  private final Sequence mPi = new A000720();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.next().subtract(mPi.next()).mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
