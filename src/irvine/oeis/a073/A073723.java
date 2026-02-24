package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A073723 Numbers k such that sigma(k) mod pi(k) = 1.
 * @author Sean A. Irvine
 */
public class A073723 extends Sequence1 {

  private final Sequence mPrimePi = new A000720().skip();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).mod(mPrimePi.next()).isOne()) {
        return Z.valueOf(mN);
      }
    }
  }
}
