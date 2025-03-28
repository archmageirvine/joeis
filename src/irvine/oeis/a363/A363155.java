package irvine.oeis.a363;
// Generated by gen_seq4.pl 2023-09-20/lambda at 2023-09-21 01:53

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A363155 Expansion of Sum_{k&gt;0} k * x^(3*k-1) / (1 - x^(5*k-2)).
 * @author Georg Fischer
 */
public class A363155 extends LambdaSequence {

  /** Construct the sequence. */
  public A363155() {
    super(1, n -> Integers.SINGLETON.sumdiv(5L * n - 1, d -> Z.valueOf(d % 5 != 3 ? 0 : (d + 2))).divide(5));
  }
}
