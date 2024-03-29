package irvine.oeis.a364;
// Generated by gen_seq4.pl 2023-09-20/lambda at 2023-09-21 01:53

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A364047 Expansion of Sum_{k&gt;0} x^k / (1 + x^(6*k)).
 * @author Georg Fischer
 */
public class A364047 extends LambdaSequence {

  /** Construct the sequence. */
  public A364047() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> d % 6 != 1 ? Z.ZERO : Z.NEG_ONE.pow((d - 1) / 6)));
  }
}
