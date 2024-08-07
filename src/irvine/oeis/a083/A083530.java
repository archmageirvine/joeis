package irvine.oeis.a083;
// Generated by gen_seq4.pl 2024-04-05/lambdan at 2024-04-05 23:22

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A083530 a(n) = 7^n mod (2*n).
 * @author Georg Fischer
 */
public class A083530 extends LambdaSequence {

  /** Construct the sequence. */
  public A083530() {
    super(1, n -> Z.SEVEN.pow(n).modZ(2L * n));
  }
}
