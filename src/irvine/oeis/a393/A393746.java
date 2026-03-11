package irvine.oeis.a393;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393746 Triangle read by rows: T(n, k) is the number of ordered pairs (i, j) of integers with 0 &lt;= i, j &lt; n such that i*j = k*n, for n&gt;=1 and k=0 to n-1.
 * @author Sean A. Irvine
 */
public class A393746 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    if (mM == 0) {
      return Z.valueOf(2 * mN - 1);
    }
    long cnt = 0;
    for (final Z d : Jaguar.factor(mM * mN).divisors()) {
      if (d.compareTo(mM) > 0 && d.compareTo(mN) < 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

