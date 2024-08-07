package irvine.oeis.a322;
// Generated by gen_seq4.pl 2024-07-07/lambdan at 2024-07-07 23:13

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a032.A032742;

/**
 * A322982 If n is a noncomposite, then a(n) = 2*n - 1, otherwise a(n) = A032742(n), the largest proper divisor of n.
 * @author Georg Fischer
 */
public class A322982 extends LambdaSequence {

  private static final DirectSequence A032742 = new A032742();

  /** Construct the sequence. */
  public A322982() {
    super(1, n -> Z.valueOf(n).isProbablePrime() ? Z.valueOf(2L * n - 1) : A032742.a(n));
  }
}
