package irvine.oeis.a084;

import irvine.oeis.InverseSequence;

/**
 * A084460 Inverse permutation to A084459.
 * @author Sean A. Irvine
 */
public class A084460 extends InverseSequence {

  /** Construct the sequence. */
  public A084460() {
    super(1, 1, new A084459(), 1);
  }
}
