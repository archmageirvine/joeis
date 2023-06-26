package irvine.oeis.a129;

import irvine.oeis.FiniteSequence;

/**
 * A129941 Left truncatable primes in base 5 (written in decimal form).
 * @author Georg Fischer
 */
public class A129941 extends FiniteSequence {

  /** Construct the sequence. */
  public A129941() {
    super(1, FINITE, 2, 3, 7, 13, 17, 23, 67, 73, 107, 113, 317, 607, 613, 1567, 7817);
  }
}
