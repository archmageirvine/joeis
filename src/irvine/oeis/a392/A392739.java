package irvine.oeis.a392;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a010.A010060;

/**
 * A392739 A balanced 4-automatic binary sequence related to Thue-Morse sequence.
 * @author Sean A. Irvine
 */
public class A392739 extends A010060 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().xor(Z.valueOf(LongUtils.log2(++mN) & 1));
  }
}
