package irvine.oeis.a143;
// Generated by gen_seq4.pl 2024-09-22.ack/lambdan at 2024-09-22 22:36

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a362.A362377;
import irvine.oeis.triangle.DirectArray;

/**
 * A143740 E.g.f. satisfies A(x) = exp(x + x^2/2 * A(x)).
 * @author Georg Fischer
 */
public class A143740 extends LambdaSequence {

  private static final DirectArray A362377 = new A362377();

  /** Construct the sequence. */
  public A143740() {
    super(0, n -> (n <= 0) ? Z.ONE : A362377.a(n, 1));
  }
}
