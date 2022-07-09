package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A020344 Fibonacci(a(n)) is the least Fibonacci number beginning with n.
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
