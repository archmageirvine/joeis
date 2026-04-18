package irvine.oeis.a084;

import irvine.oeis.InverseSequence;

/**
 * A084454 Inverse permutation to A084453.
 * @author Sean A. Irvine
 */
public class A084454 extends InverseSequence {

  /** Construct the sequence. */
  public A084454() {
    super(1, 1, new A084453(), 1);
  }
}
