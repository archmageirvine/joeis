package irvine.oeis.a364;
// Generated by gen_seq4.pl 2023-09-20/lambda at 2023-09-21 01:53

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A364067 Expansion of Sum_{k&gt;0} k * x^(2*k) / (1 - x^(3*k-1)).
 * @author Georg Fischer
 */
public class A364067 extends LambdaSequence {

  /** Construct the sequence. */
  public A364067() {
    super(1, n -> Integers.SINGLETON.sumdiv(3L * n - 2, d -> Z.valueOf(d % 3 != 2 ? 0 : (d + 1))).divide(3));
  }
}
