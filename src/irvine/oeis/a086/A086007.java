package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a056.A056809;

/**
 * A086007 Number of semiprime triples &lt;= n.
 * @author Sean A. Irvine
 */
public class A086007 extends Sequence1 {

  private final Sequence mS = new A056809();
  private long mA = mS.next().longValueExact();
  private long mN = 0;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (++mN == mA) {
      mA = mS.next().longValueExact();
      mCount = mCount.add(1);
    }
    return mCount;
  }
}

