package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A020344 <code>Fib(a(n))</code> is least Fibonacci number beginning with <code>n</code>.
 * @author Sean A. Irvine
 */
public class A020344 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String prefix = String.valueOf(++mN);
    final Sequence fibo = new A000045();
    long c = 0;
    while (!fibo.next().toString().startsWith(prefix)) {
      ++c;
    }
    return Z.valueOf(c);
  }
}
