package irvine.oeis.a161;
// Generated by gen_seq4.pl lambdian2/lambdan at 2024-09-23 17:41

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a125.A125500;

/**
 * A161631 E.g.f. satisfies A(x) = 1 + x*exp(x*A(x)).
 * @author Georg Fischer
 */
public class A161631 extends LambdaSequence {

  private static final DirectSequence A125500 = new A125500();

  /** Construct the sequence. */
  public A161631() {
    super(0, n -> (n == 0) ? Z.ONE : Z.valueOf(n).multiply(A125500.a(n - 1)));
  }
}
