package irvine.oeis.a362;
// Generated by gen_seq4.pl 2024-09-22.ack/lambdan at 2024-09-22 22:36

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;
import irvine.oeis.triangle.DirectArray;

/**
 * A362479 E.g.f. satisfies A(x) = exp(x + x^3/2 * A(x)^3).
 * @author Georg Fischer
 */
public class A362479 extends LambdaSequence {

  private static final DirectArray A362490 = new A362490();

  /** Construct the sequence. */
  public A362479() {
    super(0, n -> (n <= 2) ? Z.ONE : A362490.a(n, 3));
  }
}
