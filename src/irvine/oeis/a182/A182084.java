package irvine.oeis.a182;
// Generated by gen_seq4.pl 2024-07-26/lambdan at 2024-07-27 00:11

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a032.A032742;

/**
 * A182084 a(n) = 3*n - n/p, where p is the smallest prime dividing n.
 * @author Georg Fischer
 */
public class A182084 extends LambdaSequence {

  private static final DirectSequence A032742 = new A032742();

  /** Construct the sequence. */
  public A182084() {
    super(2, n -> Z.valueOf(3L * n).subtract(A032742.a(n)));
  }
}
