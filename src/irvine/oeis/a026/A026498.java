package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026498 a(n) = t(1+3n), where t = A001285 (Thue-Morse sequence).
 * @author Sean A. Irvine
 */
public class A026498 implements Sequence {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 3;
    return Z.valueOf(1 + (Long.bitCount(mN) & 1));
  }
}
