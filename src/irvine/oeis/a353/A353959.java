package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-06-03/lambdan at 2024-06-03 22:35

import irvine.factor.factor.Jaguar;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353959 a(n) = Sum_{d|n} d * (-1)^(d'), where d' is the arithmetic derivative of d (A003415).
 * @author Georg Fischer
 */
public class A353959 extends LambdaSequence {

  /** Construct the sequence. */
  public A353959() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(d).multiply(Jaguar.factor(d).arithmeticDerivative().testBit(0) ? Z.NEG_ONE : Z.ONE)));
  }
}
