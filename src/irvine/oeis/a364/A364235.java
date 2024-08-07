package irvine.oeis.a364;
// Generated by gen_seq4.pl 2024-07-24.ack/lambdan at 2024-07-24 22:30

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A364235 Expansion of Sum_{k&gt;=0} x^(3*k+2) / (1 + x^(3*k+2))^2.
 * @author Georg Fischer
 */
public class A364235 extends LambdaSequence {

  /** Construct the sequence. */
  public A364235() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> (n / d % 3 != 2) ? Z.ZERO : Z.NEG_ONE.pow(d + 1).multiply(d)));
  }
}
