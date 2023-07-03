package irvine.oeis.a057;

import irvine.oeis.InverseSequence;

/**
 * A057506 Signature-permutation of a Catalan Automorphism: (inverse of) "Donaghey's map M", acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A057506 extends InverseSequence {

  /** Construct the sequence. */
  public A057506() {
    super(0, new A057505(), 0, 0);
  }
}
