package irvine.oeis.a135;
// Generated by gen_seq4.pl 2025-02-16.ack/lambdan at 2025-02-16 22:50

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A135947 a(n)=(floor(3*S2(n)/2)) mod 2, where S2(n) is the binary weight of n.
 * @author Georg Fischer
 */
public class A135947 extends LambdaSequence {

  /** Construct the sequence. */
  public A135947() {
    super(0, n -> Z.valueOf((Functions.DIGIT_SUM.i(2, n) * 3L / 2) & 1));
  }
}
