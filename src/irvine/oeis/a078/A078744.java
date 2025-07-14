package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a049.A049614;

/**
 * A078744 Numbers k such that A049614(k) + A000040(k) is prime.
 * @author Sean A. Irvine
 */
public class A078744 extends Sequence1 {

  private final Sequence mA = new A000040();
  private final Sequence mB = new A049614().skip();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().add(mB.next()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
