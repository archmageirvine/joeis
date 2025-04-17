package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000796;

/**
 * A076819 Least position m &gt; n in the decimal expansion of Pi=3.1415... such that the sum of all digits at positions &lt; n is not greater than the sum of all digits at positions &gt; n and &lt;= m.
 * @author Sean A. Irvine
 */
public class A076819 extends Sequence2 {

  private final DirectSequence mPi = DirectSequence.create(new A000796());
  private long mSum = 0;
  private int mN = 0;

  @Override
  public Z next() {
    mSum += mPi.a(++mN).longValue();
    int m = mN + 1;
    long s = 0;
    while (true) {
      s += mPi.a(++m).longValue();
      if (mSum <= s) {
        return Z.valueOf(m);
      }
    }
  }
}

