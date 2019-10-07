package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026535 <code>t(2+5n)</code> where t <code>= A001285 (Thue-Morse</code> sequence).
 * @author Sean A. Irvine
 */
public class A026535 implements Sequence {

  private long mN = -4;

  @Override
  public Z next() {
    mN += 5;
    return Z.valueOf(1 + (Long.bitCount(mN) & 1));
  }
}
