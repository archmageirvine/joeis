package irvine.oeis.a362;
// Generated by gen_seq4.pl 2024-09-22.ack/lambdan at 2024-09-22 22:36

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;
import irvine.oeis.triangle.DirectArray;

/**
 * A362474 E.g.f. satisfies A(x) = exp(x + x^2/2 * A(x)^2).
 * @author Georg Fischer
 */
public class A362474 extends LambdaSequence {

  private static final DirectArray A362483 = new A362483();

  /** Construct the sequence. */
  public A362474() {
    super(0, n -> (n <= 0) ? Z.ONE : A362483.a(n, 1));
  }
}
