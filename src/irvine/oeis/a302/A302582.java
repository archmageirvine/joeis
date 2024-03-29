package irvine.oeis.a302;
// Generated by gen_seq4.pl hypergeon at 2023-11-10 15:47

import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.HypergeometricSequence;

/**
 * A302582 a(n) = n! * [x^n] log(1 + x)/(1 - x)^n.
 * @author Georg Fischer
 */
public class A302582 extends HypergeometricSequence {

  /** Construct the sequence. */
  public A302582() {
    super(0, 3, 2, "[[1],[1],[1,-1],[2],[2,-2],[-1]]", "0", (n, v) -> v.multiply(MemoryFactorial.SINGLETON.factorial(2 * n - 2)).multiply((long) n * n).divide(MemoryFactorial.SINGLETON.factorial(n)).num());
  }
}
