package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A074039 If (n, n+2) is the k-th twin prime pair then k else 0.
 * @author Sean A. Irvine
 */
public class A074039 extends A001359 {

  private long mN = 0;
  private long mM = 0;
  private long mA = super.next().longValueExact();

  @Override
  public Z next() {
    if (++mN == mA) {
      mA = super.next().longValueExact();
      return Z.valueOf(++mM);
    }
    return Z.ZERO;
  }
}
