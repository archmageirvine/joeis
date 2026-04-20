package irvine.oeis.a084;

import irvine.oeis.InverseSequence;

/**
 * A084494 Inverse permutation to A084493.
 * @author Sean A. Irvine
 */
public class A084494 extends InverseSequence {

  /** Construct the sequence. */
  public A084494() {
    super(1, 1, new A084493(), 1);
  }
}
