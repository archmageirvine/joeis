package irvine.oeis.a057;

import irvine.oeis.InverseSequence;

/**
 * A057502 Permutation of natural numbers: rotations of non-crossing handshakes encoded by A014486 (to opposite direction of A057501).
 * @author Sean A. Irvine
 */
public class A057502 extends InverseSequence {

  /** Construct the sequence. */
  public A057502() {
    super(new A057501(), 0, 0);
  }
}
