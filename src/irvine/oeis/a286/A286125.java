package irvine.oeis.a286;

import irvine.math.function.Functions;
import irvine.math.z.Fibonacci;
import irvine.oeis.FilterNumberSequence;

/**
 * A286125 Numbers n such that antisigma(n) divides Fibonacci(n).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A286125 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A286125() {
    super(1, 1, k -> {
      final long as = Functions.ANTISIGMA.l(k);
      return as != 0 && Fibonacci.fibonacci(k, as) == 0;
    });
  }
}
