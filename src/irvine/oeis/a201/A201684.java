package irvine.oeis.a201;
// Generated by gen_seq4.pl 2024-07-24.ack/sintrif at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a052.A052186;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A201684 a(n) = 2*A052186(n) - n!.
 * @author Georg Fischer
 */
public class A201684 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A201684() {
    super(0, (term, n) -> Z.TWO.multiply(term).subtract(Functions.FACTORIAL.z(n)), "", new A052186());
  }
}
