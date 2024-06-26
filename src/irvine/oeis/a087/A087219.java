package irvine.oeis.a087;
// Generated by gen_seq4.pl 2024-05-14/lambdir at 2024-05-14 21:53

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a078.A078932;

/**
 * A087219 Satisfies A(x) = f(x) + x*A(x)*f(x)^2, where f(x) = Sum_{k&gt;=0} x^((3^n-1)/2) and f(x)^2 = 2 - f(x^2) + 2*Sum_{n&gt;0} x^A023745(n). Also, A(x) = f(x)*B(x), where B(x) = Sum_{k&gt;=0} A087218(k)*x^k.
 * @author Georg Fischer
 */
public class A087219 extends LambdaSequence {

  private static final DirectSequence SEQ = new A078932();

  /** Construct the sequence. */
  public A087219() {
    super(0, n -> SEQ.a(2 * n + 1));
  }
}
