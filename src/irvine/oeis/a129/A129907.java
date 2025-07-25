package irvine.oeis.a129;
// Generated by gen_seq4.pl 2025-07-13.ack/sintrif at 2025-07-13 21:23

import irvine.math.function.Functions;
import irvine.oeis.a072.A072446;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A129907 a(n) is the greatest prime factor of A072446(n).
 * @author Georg Fischer
 */
public class A129907 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A129907() {
    super(1, (term, n) -> Functions.GPF.z(term), "", new A072446());
  }
}
