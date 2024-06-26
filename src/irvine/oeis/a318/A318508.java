package irvine.oeis.a318;
// Generated by gen_seq4.pl 2024-06-26/lambdan at 2024-06-26 17:12

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a001.A001065;
import irvine.oeis.a032.A032742;

/**
 * A318508 a(n) = A032742(n) AND A001065(n)-A032742(n), where AND is bitwise-and (A004198) and A001065 = sum of proper divisors and A032742 = the largest proper divisor of n.
 * @author Georg Fischer
 */
public class A318508 extends LambdaSequence {

  private static final DirectSequence A001065 = new A001065();
  private static final DirectSequence A032742 = new A032742();

  /** Construct the sequence. */
  public A318508() {
    super(1, n -> (n == 1) ? Z.ZERO : A032742.a(n).and(A001065.a(n).subtract(A032742.a(n))));
  }
}
