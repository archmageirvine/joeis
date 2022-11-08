package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060305 Pisano periods for primes: period of Fibonacci numbers mod prime(n).
 * @author Sean A. Irvine
 */
public class A060305 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z a = Z.ONE;
    Z b = Z.ONE;
    long cnt = 1;
    while (!a.isZero() || !Z.ONE.equals(b)) {
      final Z t = a.add(b).mod(p);
      a = b;
      b = t;
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
