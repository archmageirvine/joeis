package irvine.oeis.a084;

import irvine.oeis.InverseSequence;

/**
 * A084466 Inverse permutation to A084455.
 * @author Sean A. Irvine
 */
public class A084466 extends InverseSequence {

  /** Construct the sequence. */
  public A084466() {
    super(1, 1, new A084455(), 1);
  }
}
