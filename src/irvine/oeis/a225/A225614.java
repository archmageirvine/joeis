package irvine.oeis.a225;

import irvine.oeis.FiniteSequence;

/**
 * A225614 The smallest n-digit number where first k digits are divisible by k-th prime for k = 1..n.
 * @author Georg Fischer
 */
public class A225614 extends FiniteSequence {

  /** Construct the sequence. */
  public A225614() {
    super(2, 21, 210, 2100, 21076, 210769, 2107694, 21076947, 210769470L, 6300846559L);
  }
}
