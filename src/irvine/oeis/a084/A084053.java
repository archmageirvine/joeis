package irvine.oeis.a084;
// Generated by gen_seq4.pl 2024-03-08/lambdan at 2024-03-10 23:05

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.LambdaSequence;

/**
 * A084053 4*n digit-reversed mod 4.
 * @author Georg Fischer
 */
public class A084053 extends LambdaSequence {

  /** Construct the sequence. */
  public A084053() {
    super(3, n -> ZUtils.reverse(Z.valueOf(4 * n)).modZ(4));
  }
}
