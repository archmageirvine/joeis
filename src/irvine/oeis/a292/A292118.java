package irvine.oeis.a292;

import irvine.math.z.Z;
import irvine.oeis.a003.A003159;

/**
 * A292118 G.f.: 1 + 2*Sum_{k &gt;= 1} (-1)^k*q^A003159(k).
 * @author Sean A. Irvine
 */
public class A292118 extends A003159 {

  /** Construct the sequence. */
  public A292118() {
    super(0);
  }

  private long mA = super.next().longValueExact();
  private long mM = -1;
  private boolean mSign = true;

  @Override
  public Z next() {
    if (++mM == 0) {
      return Z.ONE;
    } else if (mM != mA) {
      return Z.ZERO;
    } else {
      mSign = !mSign;
      mA = super.next().longValueExact();
      return Z.valueOf(mSign ? 2 : -2);
    }
  }
}
