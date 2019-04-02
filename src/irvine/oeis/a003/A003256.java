package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a001.A001950;

/**
 * A003256 The number m such that A242094(m) = A001950(n).
 * @author Sean A. Irvine
 */
public class A003256 extends A001950 {

  private final A003234 mS = new A003234();
  private long mA = mS.next().longValueExact();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA < mN) {
      mA = mS.next().longValueExact();
      ++mM;
    }
    return super.next().subtract(mM);
  }

}
