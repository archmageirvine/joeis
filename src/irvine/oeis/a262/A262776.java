package irvine.oeis.a262;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A262776 a(n) = Fibonacci(n!) mod Fibonacci(n)!.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A262776 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 6) {
      return Z.ZERO;
    }
    final Z mod = Functions.FACTORIAL.z(Functions.FIBONACCI.z(mN));
    Z a = Z.ZERO;
    Z b = Z.ONE;
    final long fn = Functions.FACTORIAL.l(mN);
    for (long k = 1; k < fn; ++k) {
      final Z t = a.add(b).mod(mod);
      a = b;
      b = t;
    }
    return b;
  }
}
