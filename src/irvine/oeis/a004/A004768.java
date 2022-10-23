package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004768 Binary expansion ends 001.
 * @author Sean A. Irvine
 */
public class A004768 extends Sequence0 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(8);
    return mN;
  }
}

