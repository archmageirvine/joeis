package irvine.oeis.a393;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393260 Number of distinct results from equations consisting of n copies of the number n and one of the four basic arithmetic operations {+, -, *, /} between each pair with multiplication and division taking precedence over addition and subtraction.
 * @author Sean A. Irvine
 */
public class A393260 extends Sequence1 {

  private int mN = 0;
  private final HashSet<Q> mA = new HashSet<>();

  private void search(final Q s, final Q v, final int remaining) {
    if (remaining == 0) {
      mA.add(s.add(v));
      return;
    }
    search(s.add(v), Q.valueOf(mN), remaining - 1);
    search(s.add(v), Q.valueOf(-mN), remaining - 1);
    search(s, v.multiply(mN), remaining - 1);
    search(s, v.divide(mN), remaining - 1);
  }

  @Override
  public Z next() {
    mA.clear();
    search(Q.ZERO, Q.valueOf(++mN), mN - 1);
    return Z.valueOf(mA.size());
  }
}
