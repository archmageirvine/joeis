package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a214.A214158;

/**
 * A083702 Smallest number having Fibonacci(n) as least primitive root, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083702 extends Sequence1 {

  private final Sequence mA = new A214158();
  private long mN = 0;
  private long mM = -1;

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
