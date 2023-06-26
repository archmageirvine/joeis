package irvine.oeis.a211;

import irvine.oeis.FiniteSequence;

/**
 * A211403 The smallest n-digit number where last k digits are divisible by k-th prime for k = 1..n.
 * @author Georg Fischer
 */
public class A211403 extends FiniteSequence {

  /** Construct the sequence. */
  public A211403() {
    super(1, FINITE, 0, 12, 100, 1190, 10560, 217490, 1377000, 18319800, 224246090L);
  }
}
