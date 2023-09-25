package irvine.oeis.a075;
// manually inverse at 2023-09-24 23:12

import irvine.oeis.InverseSequence;

/**
 * A075301 Inverse permutation to A075300.
 * @author Georg Fischer
 */
public class A075301 extends InverseSequence {

  /** Construct the sequence. */
  public A075301() {
    super(new A075300(), 0, 0);
  }
}
