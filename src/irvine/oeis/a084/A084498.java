package irvine.oeis.a084;

import irvine.oeis.InverseSequence;

/**
 * A084498 Inverse permutation to A084497.
 * @author Sean A. Irvine
 */
public class A084498 extends InverseSequence {

  /** Construct the sequence. */
  public A084498() {
    super(1, 1, new A084497(), 1);
  }
}
