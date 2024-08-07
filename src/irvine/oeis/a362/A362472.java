package irvine.oeis.a362;
// Generated by gen_seq4.pl 2024-07-11/lambdin at 2024-07-11 18:00

import irvine.oeis.LambdaSequence;
import irvine.oeis.triangle.DirectArray;

/**
 * A362472 E.g.f. satisfies A(x) = exp(x + x^3 * A(x)^3).
 * @author Georg Fischer
 */
public class A362472 extends LambdaSequence {

  private static final DirectArray A362490 = new A362490();

  /** Construct the sequence. */
  public A362472() {
    super(0, n -> A362490.a(n, 6), "1, 1, 1, 7, 97, 961");
  }
}
