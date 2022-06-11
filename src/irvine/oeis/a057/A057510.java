package irvine.oeis.a057;

import irvine.oeis.InverseSequence;

/**
 * A057510 Permutation of natural numbers: rotations of the bottom branches of the rooted plane trees encoded by A014486. (to opposite direction of A057509).
 * @author Sean A. Irvine
 */
public class A057510 extends InverseSequence {

  /** Construct the sequence. */
  public A057510() {
    super(new A057509(), 0, 0);
  }
}
