package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026513 a(n) = t(2+3n), where t = A001285 (Thue-Morse sequence).
 * @author Sean A. Irvine
 */
public class A026513 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 3;
    return Z.valueOf(1 + (Long.bitCount(mN) & 1));
  }
}
