package irvine.oeis.a349;
// Generated by gen_seq4.pl 2024-07-01/lambdan at 2024-07-01 18:26

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a348.A348996;

/**
 * A349000 a(n) = A323166(A276086(n)), where A323166(n) = gcd(n, usigma(n)), usigma (A034448) is multiplicative with a(p^e) = (p^e)+1, and A276086 gives the prime product form of primorial base expansion of n.
 * @author Georg Fischer
 */
public class A349000 extends LambdaSequence {

  private static final DirectSequence A348996 = new A348996();

  /** Construct the sequence. */
  public A349000() {
    super(0, n -> Functions.GCD.z(Functions.PRIMORIAL_BASE_EXP.z(n), A348996.a(n)));
  }
}
