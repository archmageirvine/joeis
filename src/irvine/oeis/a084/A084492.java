package irvine.oeis.a084;

import irvine.oeis.InverseSequence;

/**
 * A084492 Inverse permutation to A084491.
 * @author Sean A. Irvine
 */
public class A084492 extends InverseSequence {

  /** Construct the sequence. */
  public A084492() {
    super(1, 1, new A084491(), 1);
  }
}
