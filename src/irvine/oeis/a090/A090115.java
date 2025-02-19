package irvine.oeis.a090;
// Generated by gen_seq4.pl 2024-11-19.ack/sintrif at 2024-11-19 23:27

import irvine.math.function.Functions;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A090115 a(n)=Product[p(n)-j, j=1..n]/n!=A090114(n)/n!.
 * @author Georg Fischer
 */
public class A090115 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A090115() {
    super(1, (term, n) -> term.divide(Functions.FACTORIAL.z(n)), "", new A090114());
  }
}
