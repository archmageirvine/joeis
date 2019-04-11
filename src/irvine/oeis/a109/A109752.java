package irvine.oeis.a109;

import irvine.oeis.FiniteSequence;

/**
 * A109752 Using the lunar product (see A087062 for definition), numbers n such that if n divides a*b, then n must divide either a or b. The multiplicative identity, <code>9,</code> is excluded by convention.
 * @author Georg Fischer
 */
public class A109752 extends FiniteSequence {

  /** Construct the sequence. */
  public A109752() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 90);
  }
}
