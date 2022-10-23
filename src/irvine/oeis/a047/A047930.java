package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A047930 Smallest positive Fibonacci number divisible by n.
 * @author Sean A. Irvine
 */
public class A047930 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence fibo = new A000045();
    fibo.next();
    fibo.next();
    Z f;
    do {
      f = fibo.next();
    } while (f.mod(mN) != 0);
    return f;
  }
}
