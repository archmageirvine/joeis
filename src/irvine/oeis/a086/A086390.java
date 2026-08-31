package irvine.oeis.a086;

import irvine.math.predicate.Predicates;
import irvine.math.z.Fibonacci;
import irvine.oeis.FilterNumberSequence;

/**
 * A086390 Composite n such that F(n^2+1)==1 (mod n) where F(k) denotes the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A086390 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A086390() {
    super(1, 4, k -> !Predicates.PRIME.is(k) && Fibonacci.fibonacci(k * k + 1, k) == 1);
  }
}

