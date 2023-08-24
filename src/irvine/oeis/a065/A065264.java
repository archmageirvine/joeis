package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065264 Inverse permutation to A065263.
 * @author Sean A. Irvine
 */
public class A065264 extends InverseSequence {

  /** Construct the sequence. */
  public A065264() {
    super(1, new A065263(), 1);
  }
}
