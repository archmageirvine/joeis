package irvine.oeis.a084;

import irvine.oeis.InverseSequence;

/**
 * A084496 Inverse permutation to A084495.
 * @author Sean A. Irvine
 */
public class A084496 extends InverseSequence {

  /** Construct the sequence. */
  public A084496() {
    super(1, 1, new A084495(), 1);
  }
}
