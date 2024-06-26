package irvine.oeis.a217;
// Generated by gen_seq4.pl 2024-06-23/sintrif at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a031.A031215;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A217622 Prime(prime(2*n)).
 * @author Georg Fischer
 */
public class A217622 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A217622() {
    super(1, (term, n) -> Functions.PRIME.z(term), "", new A031215());
  }
}
