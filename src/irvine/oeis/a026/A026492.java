package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026492 <code>a(n) = t(1+3n)</code>, where t <code>= A001285 (Thue-Morse</code> sequence).
 * @author Sean A. Irvine
 */
public class A026492 implements Sequence {

  private long mN = -3;

  @Override
  public Z next() {
    mN += 3;
    return Z.valueOf(1 + (Long.bitCount(mN) & 1));
  }
}
