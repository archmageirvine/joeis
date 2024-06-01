package irvine.oeis.a349;
// manually 2024-05-31

import irvine.factor.factor.Jaguar;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a003.A003961;

/**
 * A349905 Arithmetic derivative of A003961(n), where A003961 is fully multiplicative with a(p) = nextprime(p).
 * @author Georg Fischer
 */
public class A349905 extends LambdaSequence {

  private static final DirectSequence A003961 = new A003961();

  /** Construct the sequence. */
  public A349905() {
    super(1, n -> Jaguar.factor(A003961.a(n)).arithmeticDerivative());
  }
}
