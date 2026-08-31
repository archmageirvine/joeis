package irvine.oeis.a086;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A086389.
 * @author Sean A. Irvine
 */
public class A086392 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next().multiply2();
      if (Fibonacci.fibonacci(k.square().add(1), k).equals(Z.FIVE)) {
        return k;
      }
    }
  }
}

