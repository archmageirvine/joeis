package irvine.oeis.a295;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A295741 a(n) is smallest divisor d of the n-th primorial such that d + prime(n)#/d is prime.
 * @author Sean A. Irvine
 */
public class A295741 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z p = Functions.PRIMORIAL_COUNT.z(++mN);
    // Because of the number of divisors of p# for larger p, doing ".divisorsSorted()" here is not a good idea
    long k = 0;
    while (true) {
      final Z[] qr = p.divideAndRemainder(++k);
      if (qr[1].isZero() && qr[0].add(k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
