package irvine.oeis.a080;

import irvine.oeis.Combiner;

/**
 * A080361 a(n) is the difference between the largest and the smallest positive integers x such that the number of unitary-prime-divisors of x! equals n. Same as the difference between the largest and the smallest positive integers x such that the number of primes in (x/2,x] equals n.
 * @author Sean A. Irvine
 */
public class A080361 extends Combiner {

  /** Construct the sequence. */
  public A080361() {
    super(1, new A080360(), new A080359(), SUBTRACT);
  }
}
