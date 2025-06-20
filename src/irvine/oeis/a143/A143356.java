package irvine.oeis.a143;
// Generated by gen_seq4.pl 2025-06-16.ack/lambdan at 2025-06-16 21:55

import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a006.A006218;

/**
 * A143356 A051731 * A006218.
 * @author Georg Fischer
 */
public class A143356 extends LambdaSequence {

  private static final DirectSequence A006218 = new A006218();

  /** Construct the sequence. */
  public A143356() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> A006218.a(d)));
  }
}
