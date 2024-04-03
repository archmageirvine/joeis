package irvine.oeis.a294;
// manually 2024-03-25/lambdan at 2024-03-28 10:53

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A294515 Denominators of partial sums of the reciprocals of the decagonal numbers.
 * @author Georg Fischer
 */
public class A294515 extends LambdaSequence {

  /** Construct the sequence. */
  public A294515() {
    super(0, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(Z.ONE, Z.valueOf((k + 1) * (4 * (k + 1) - 3)))).den());
  }
}
