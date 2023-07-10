package irvine.oeis.a064;
// manually 2023-07-10

import irvine.oeis.InverseSequence;

/**
 * A064664 Regard A064413 as giving a permutation of the positive integers; sequence gives inverse permutation.
 * @author Georg Fischer
 */
public class A064664 extends InverseSequence {

  /** Construct the sequence. */
  public A064664() {
    super(1, new A064413());
  }
}
