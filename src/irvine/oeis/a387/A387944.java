package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a120.A120944;

/**
 * A387944 allocated for Charles Kusniec.
 * @author Sean A. Irvine
 */
public class A387944 extends Sequence1 {

  private final Sequence mA = new A120944();
  private long mT = mA.next().longValueExact();
  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (++mN == mT) {
      mSum = mSum.add(1);
      mT = mA.next().longValueExact();
    }
    return mSum;
  }
}
