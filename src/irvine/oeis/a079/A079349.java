package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A079349 p-(p/5) where Fibonacci(p-(p/5)) is not the first Fibonacci number that p divides.
 * @author Sean A. Irvine
 */
public class A079349 extends Sequence1 {

  private final Sequence mPrimes = new A000040().skip(3);

  @Override
  public Z next() {
    while (true) {
      final Z p = mPrimes.next();
      final Z w = p.subtract(Functions.KRONECKER.z(5, p));
      final long t = w.longValueExact();
      for (long k = 1; k < t; ++k) {
        final Z f = Functions.FIBONACCI.z(k);
        if (f.mod(p).isZero()) {
          return w;
        }
      }
    }
  }
}

