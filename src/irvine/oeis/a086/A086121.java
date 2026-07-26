package irvine.oeis.a086;

import irvine.oeis.UnionSequence;

/**
 * A086121 Positive sums or differences of two cubes of primes.
 * @author Sean A. Irvine
 */
public class A086121 extends UnionSequence {

  /** Construct the sequence. */
  public A086121() {
    super(1, new A086120(), new A086119());
  }
}

