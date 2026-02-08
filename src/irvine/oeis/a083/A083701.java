package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a023.A023048;

/**
 * A083701 Smallest prime having Fibonacci(n) as least primitive root, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A083701 extends Sequence1 {

  private final Sequence mA = new A023048();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.TWO;
    }
    final long f = Functions.FIBONACCI.l(mN);
    while (true) {
      final Z r = mA.next();
      if (++mM == f) {
        return r;
      }
    }
  }
}
