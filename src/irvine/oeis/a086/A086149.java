package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a049.A049489;

/**
 * A086149 Primes p such that p + 32 is also prime and there are seven primes between p and p + 32.
 * @author Sean A. Irvine
 */
public class A086149 extends FilterSequence {

  /** Construct the sequence. */
  public A086149() {
    super(1, new A049489(), p -> {
      final Z p32 = p.add(32);
      int cnt = -1;
      while (p.compareTo(p32) < 0) {
        if (++cnt > 7) {
          break;
        }
        p = Functions.NEXT_PRIME.z(p);
      }
      return cnt == 7;
    });
  }
}
