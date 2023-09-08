package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065650 Inverse permutation to A065649.
 * @author Sean A. Irvine
 */
public class A065650 extends InverseSequence {

  /** Construct the sequence. */
  public A065650() {
    super(0, new A065649(), 0);
  }
}
