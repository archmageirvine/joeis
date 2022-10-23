package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A026475 a(1)=1, a(2)=3, otherwise a(n) = least positive integer &gt; a(n-1) and not a(i) + a(j) + a(k) for 1 &lt;= i &lt; j &lt; k &lt;= n.
 * @author Sean A. Irvine
 */
public class A026475 extends Sequence1 {

  private static final Z[] SMALL = {Z.ONE, Z.THREE, Z.FOUR, Z.FIVE, Z.SIX, Z.SEVEN, Z.valueOf(19)};
  private static final long[] ADD = {20, 21, 22, 36, 37, 38, 39};
  private int mS = 0;
  private int mT = 0;
  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    if (mS < SMALL.length) {
      return SMALL[mS++];
    }
    if (mT == ADD.length) {
      mK = mK.add(33);
      mT = 0;
    }
    return mK.add(ADD[mT++]);
  }
}
