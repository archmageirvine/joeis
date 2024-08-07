package irvine.oeis.a359;
// Generated by gen_seq4.pl 2024-07-02/sintrif at 2024-07-03 22:28

import irvine.math.function.Functions;
import irvine.oeis.a025.A025487;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A359182 Totient of numbers of least prime signature: a(n) = A000010(A025487(n)).
 * @author Georg Fischer
 */
public class A359182 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A359182() {
    super(1, (term, n) -> Functions.PHI.z(term), "", new A025487());
  }
}
