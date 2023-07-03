package irvine.oeis.a057;

import irvine.oeis.InverseSequence;

/**
 * A057512 Permutation of natural numbers: rotations of all branches of the rooted plane trees encoded by A014486. (to opposite direction of A057511).
 * @author Sean A. Irvine
 */
public class A057512 extends InverseSequence {

  /** Construct the sequence. */
  public A057512() {
    super(0, new A057511(), 0, 0);
  }
}
