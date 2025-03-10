package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A075775 Numbers k that divide phi(Fibonacci(k)).
 * @author Sean A. Irvine
 */
public class A075775 extends Sequence1 {

  private final Sequence mF = new A000045().skip();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(mF.next()).mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
