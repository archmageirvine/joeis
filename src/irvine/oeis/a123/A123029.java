package irvine.oeis.a123;
// manually interleave at 2023-04-16 16:45

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a194.A194157;
import irvine.oeis.a194.A194158;

/**
 * A123029 a(2*n-1) = Product_{i=1..n} Fibonacci(2*i-1) and a(2*n) = Product_{i=1..n} Fibonacci(2*i).
 * @author Georg Fischer
 */
public class A123029 extends AlternatingSequence {

  /** Construct the sequence. */
  public A123029() {
    super(1, new A194158(), new A194157());
  }
}
