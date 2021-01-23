package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026517 a(n) = t(5n), where t = A001285 (Thue-Morse sequence).
 * @author Sean A. Irvine
 */
public class A026517 implements Sequence {

  private long mN = -5;

  @Override
  public Z next() {
    mN += 5;
    return Z.valueOf(1 + (Long.bitCount(mN) & 1));
  }
}
