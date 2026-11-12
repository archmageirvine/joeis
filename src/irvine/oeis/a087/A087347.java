package irvine.oeis.a087;

import irvine.math.z.Fibonacci;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A087347 Numbers k that divide Sum_{j=1..k} Fibonacci(j*k).
 * @author Sean A. Irvine
 */
public class A087347 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A087347() {
    super(1, k -> {
      final Z zk = Z.valueOf(k);
      return Integers.SINGLETON.sum(1, k, j -> Fibonacci.fibonacci(zk.multiply(j), zk)).mod(k) == 0;
    });
  }
}
