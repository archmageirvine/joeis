package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065270 Inverse permutation to A065269.
 * @author Sean A. Irvine
 */
public class A065270 extends InverseSequence {

  /** Construct the sequence. */
  public A065270() {
    super(1, new A065269(), 1);
  }
}
