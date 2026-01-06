package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392057 allocated for Alex Ratushnyak.
 * @author Sean A. Irvine
 */
public class A392057 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = Z.valueOf(mA.bitCount() + Long.bitCount(++mN));
    return mA;
  }
}
