package irvine.oeis.a162;
// Generated by gen_seq4.pl 2024-11-13.ack/lambdan at 2024-11-13 22:27

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.LambdaSequence;

/**
 * A162473 Write n in binary n times and concatenate (see example). a(n) is the decimal equivalent.
 * @author Georg Fischer
 */
public class A162473 extends LambdaSequence {

  /** Construct the sequence. */
  public A162473() {
    super(1, n -> new Z(ZUtils.concatenate(1, n, k -> new Z(Integer.toString(n, 2))).toString(), 2));
  }
}
