package irvine.oeis.a261;
// manually primen/primenp at 2022-04-04 14:04

import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.a060.A060822;

/**
 * A261457 a(n) = prime(n)! - n!.
 * @author Georg Fischer
 */
public class A261457 extends A060822 {

  /** Construct the sequence. */
  public A261457() {
    super(1, (n, p) -> MemoryFactorial.SINGLETON.factorial(p).subtract(MemoryFactorial.SINGLETON.factorial(n)));
  }
}
