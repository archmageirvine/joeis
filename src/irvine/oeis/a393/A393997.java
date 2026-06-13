package irvine.oeis.a393;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393997 Number of steps to reach the end of the cycle starting with n/(2n+1), or -1 if the end of the cycle is never reached, in the following process: If the numerator is even, divide the fraction by 2, otherwise multiply the fraction by 3 and add 1.
 * @author Sean A. Irvine
 */
public class A393997 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    Q t = new Q(++mN, 2 * mN + 1);
    final HashSet<Q> seen = new HashSet<>();
    while (seen.add(t)) {
      t = t.num().isEven() ? t.divide(2) : t.multiply(3).add(1);
    }
    return Z.valueOf(seen.size() - 1);
  }
}
