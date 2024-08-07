package irvine.oeis.a330;
// Generated by gen_seq4.pl 2024-07-11/sintrif at 2024-07-11 18:00

import irvine.math.function.Functions;
import irvine.oeis.a181.A181815;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A330682 a(n) = 1 if the 2-adic and 3-adic valuations of A025487(n) are equal, 0 otherwise.
 * @author Georg Fischer
 */
public class A330682 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A330682() {
    super(1, (term, n) -> Functions.PARITY.z(term), "", new A181815());
  }
}
