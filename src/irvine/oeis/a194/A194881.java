package irvine.oeis.a194;
// Generated by gen_seq4.pl 2024-11-22.ack/lambdan at 2024-11-22 22:47

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A194881 A number of sum-free sets related to fractional parts of multiples of a rational number in the range 1/3 to 2/3.
 * @author Georg Fischer
 */
public class A194881 extends LambdaSequence {

  /** Construct the sequence. */
  public A194881() {
    super(1, n -> new Q(1).add(Rationals.SINGLETON.sum(1, n, j -> new Q(Functions.PHI.z(3 * j)).divide(2))).num());
  }
}
