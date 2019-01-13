package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004280.
 * @author Sean A. Irvine
 */
public class A004280 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN += mN < 3 ? 1 : 2;
    return Z.valueOf(mN);
  }
}
