package irvine.oeis.a068;

import irvine.oeis.a005.A005478;
import irvine.oeis.closure.MultiplicativeClosureSequence;

/**
 * A068095 All primes dividing each term are Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A068095 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A068095() {
    super(1, new A005478());
  }
}

