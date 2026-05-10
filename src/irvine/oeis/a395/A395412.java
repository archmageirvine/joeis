package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A395412 a(n) = number of k's that make A002110(n)/A005117(k)+A005117(k) prime, A005117(k)&lt;prime(n).
 * @author Sean A. Irvine
 */
public class A395412 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    final Z pr = Functions.PRIMORIAL.z(p);
    long cnt = 0;
    for (long d = 1; d < p; ++d) {
      if (Predicates.SQUARE_FREE.is(d) && pr.divide(d).add(d).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
