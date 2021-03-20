package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A045734 Smallest Fibonacci number beginning "n^2".
 * @author Sean A. Irvine
 */
public class A045734 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Sequence fibo = new A000045();
    final String prefix = Z.valueOf(++mN).square().toString();
    while (true) {
      final Z f = fibo.next();
      if (f.toString().startsWith(prefix)) {
        return f;
      }
    }
  }
}
