package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026535 a(n) = t(1+5n) where t = A001285 (Thue-Morse sequence).
 * @author Sean A. Irvine
 */
public class A026535 extends Sequence0 {

  private long mN = -4;

  @Override
  public Z next() {
    mN += 5;
    return Z.valueOf(1 + (Long.bitCount(mN) & 1));
  }
}
