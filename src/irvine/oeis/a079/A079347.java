package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a001.A001602;

/**
 * A079347 Fibonacci(p-(p/5)) is the first Fibonacci number that p divides and this is p-(p/5).
 * @author Sean A. Irvine
 */
public class A079347 extends A001602 {

  private final Sequence mPrimes = new A000040();

  @Override
  public Z next() {
    while (true) {
      final Z p = mPrimes.next();
      final Z t = p.subtract(Functions.KRONECKER.z(5, p));
      if (super.next().equals(t)) {
        return t;
      }
    }
  }
}

