package irvine.oeis.a363;
// Generated by gen_seq4.pl 2023-09-20/lambda at 2023-09-21 01:53

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A363971 Expansion of Sum_{k&gt;0} k^2 * x^(3*k-1) / (1 - x^(3*k-1)).
 * @author Georg Fischer
 */
public class A363971 extends LambdaSequence {

  /** Construct the sequence. */
  public A363971() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(d % 3 != 2 ? 0 : (d + 1) / 3).square()));
  }
}
