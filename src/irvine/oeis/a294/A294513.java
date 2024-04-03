package irvine.oeis.a294;
// manually 2024-03-25/lambdan at 2024-03-28 10:53

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A294513 Denominators of the partial sums of the reciprocals of twice the pentagonal numbers.
 * @author Georg Fischer
 */
public class A294513 extends LambdaSequence {

  /** Construct the sequence. */
  public A294513() {
    super(0, n -> n == 0 ? Z.TWO : (n == 1 ? Z.FIVE : Rationals.SINGLETON.sum(1, n, k -> new Q(Z.ONE, Z.valueOf((k + 1) * (3 * (k + 1) - 1)))).den()));
  }
}
