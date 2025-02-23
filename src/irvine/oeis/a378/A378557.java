package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-02-03.ack/sintrif at 2025-02-03 18:14

import irvine.math.z.Z;
import irvine.oeis.a131.A131629;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A378557 Powers of 3 that do not contain the digit 3.
 * @author Georg Fischer
 */
public class A378557 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A378557() {
    super(1, (term, n) -> Z.THREE.pow(term), "", new A131629());
  }
}
