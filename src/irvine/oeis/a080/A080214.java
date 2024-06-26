package irvine.oeis.a080;
// Generated by gen_seq4.pl 2024-04-09/lambdan at 2024-04-09 23:00

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A080214 Binomial(greatest prime factor of n, smallest prime factor of n).
 * @author Georg Fischer
 */
public class A080214 extends LambdaSequence {

  /** Construct the sequence. */
  public A080214() {
    super(1, n -> Binomial.binomial(Functions.GPF.z(n), Functions.LPF.z(n)));
  }
}
