package irvine.oeis.a075;

import irvine.oeis.Combiner;
import irvine.oeis.a034.A034386;

/**
 * A075368 Smallest integer value of lcm(n+1, n+2, ..., n+k) (for k &gt;= 0) divided by the product of all the primes up to n.
 * @author Sean A. Irvine
 */
public class A075368 extends Combiner {

  /** Construct the sequence. */
  public A075368() {
    super(1, new A075367(), new A034386().skip(), DIVIDE);
  }
}
