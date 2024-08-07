package irvine.oeis.a336;
// Generated by gen_seq4.pl 2024-07-15/lambdan at 2024-07-15 19:12

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a008.A008480;

/**
 * A336105 Number of permutations of the prime indices of 2^n - 1.
 * @author Georg Fischer
 */
public class A336105 extends LambdaSequence {

  private static final DirectSequence A008480 = new A008480();

  /** Construct the sequence. */
  public A336105() {
    super(1, n -> A008480.a(Z.TWO.pow(n).subtract(1)));
  }
}
