package irvine.oeis.a393;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A393112 Integers k &gt;= 4 such that 2^k is record-close to a base-10 palindrome, in the sense that A393111(k)/2^(k/2) sets a new minimum.
 * @author Sean A. Irvine
 */
public class A393112 extends Sequence1 {

  private final Sequence mA = new A393111().skip(4);
  private Q mMin = Q.TWO;
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next();
      final Q r = new Q(t.square(), Z.ONE.shiftLeft(++mN));
      if (r.compareTo(mMin) < 0) {
        mMin = r;
        return Z.valueOf(mN);
      }
    }
  }
}
