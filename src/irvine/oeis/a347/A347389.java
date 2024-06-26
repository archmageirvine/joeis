package irvine.oeis.a347;
// Generated by gen_seq4.pl 2024-07-01/lambdan at 2024-07-01 18:26

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a327.A327860;

/**
 * A347389 Dirichlet convolution of A003415(n) and A003415(A276086(n)), where A003415(n) is the arithmetic derivative of n, and A276086(n) gives the prime product form of primorial base expansion of n.
 * @author Georg Fischer
 */
public class A347389 extends LambdaSequence {

  private static final DirectSequence A327860 = new A327860();

  /** Construct the sequence. */
  public A347389() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Functions.ARD.z(n / d).multiply(A327860.a(d))));
  }
}
