package irvine.oeis.a366;
// Generated by gen_seq4.pl 2024-03-07/lambdan at 2024-03-07 22:01

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A366975 Expansion of Sum_{k &gt;=1} x^(3*k)/(1-x^k)^(k+1).
 * @author Georg Fischer
 */
public class A366975 extends LambdaSequence {

  /** Construct the sequence. */
  public A366975() {
    super(1, n -> (n < 2) ? Z.ZERO : Integers.SINGLETON.sumdiv(n, d -> Binomial.binomial(d + n / d - 3, d)));
  }
}
