package irvine.oeis.a363;
// Generated by gen_seq4.pl 2023-09-20/lambda at 2023-09-21 01:53

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A363925 Expansion of Sum_{k&gt;0} x^k / (1 - x^(5*k))^2.
 * @author Georg Fischer
 */
public class A363925 extends LambdaSequence {

  /** Construct the sequence. */
  public A363925() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(d % 5 != 1 ? 0 : (d + 4) / 5)));
  }
}
