package irvine.oeis.a127;
// Generated by gen_seq4.pl 2024-11-21.ack/sintrif at 2024-11-21 23:03

import irvine.math.z.Z;
import irvine.oeis.a057.A057469;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A127908 Primes of form (3^n + 2^n)/5.
 * @author Georg Fischer
 */
public class A127908 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A127908() {
    super(1, (term, n) -> Z.TWO.pow(term).add(Z.THREE.pow(term)).divide(5), "", new A057469());
  }
}
