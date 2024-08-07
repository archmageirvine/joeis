package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-07-15/lambdan at 2024-07-15 19:12

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a108.A108951;

/**
 * A373986 Numerator of A373158(n) / A108951(n), where A108951 is fully multiplicative and A373158 is fully additive with a(p) = p# for prime p, where x# is the primorial A034386(x).
 * @author Georg Fischer
 */
public class A373986 extends LambdaSequence {

  private static final DirectSequence A108951 = new A108951();
  private static final DirectSequence A373158 = new A373158();

  /** Construct the sequence. */
  public A373986() {
    super(1, n -> A373158.a(n).divide(Functions.GCD.z(A108951.a(n), A373158.a(n))));
  }
}
