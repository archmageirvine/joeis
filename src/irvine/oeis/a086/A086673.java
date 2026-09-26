package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a085.A085733;

/**
 * A086673 Number of right-truncatable semiprimes &lt;= n.
 * @author Sean A. Irvine
 */
public class A086673 extends Sequence1 {

  private final Sequence mA = new A085733();
  private long mM = mA.next().longValueExact();
  private long mN = 0;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (++mN == mM) {
      mM = mA.next().longValueExact();
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
