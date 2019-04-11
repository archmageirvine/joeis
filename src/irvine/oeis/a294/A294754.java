package irvine.oeis.a294;

import irvine.oeis.FiniteSequence;

/**
 * A294754 Permutations of <code>[n]</code> avoiding <code>{4321, 4123, 1234}</code>.
 * @author Georg Fischer
 */
public class A294754 extends FiniteSequence {

  /** Construct the sequence. */
  public A294754() {
    super(1, 1, 2, 6, 21, 72, 205, 396, 400, 185);
  }
}
