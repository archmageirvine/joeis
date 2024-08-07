package irvine.oeis.a120;
// Generated by gen_seq4.pl 2024-07-15/lambdan at 2024-07-15 19:12

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A120016 a(n) = A120014(n)/n = coefficient of x^n, divided by n, in the n-th iteration of the g.f. of A120009 for n&gt;=1.
 * @author Georg Fischer
 */
public class A120016 extends LambdaSequence {

  private static final DirectSequence A120014 = new A120014();

  /** Construct the sequence. */
  public A120016() {
    super(1, n -> A120014.a(n).divide(n));
  }
}
