package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063694 Remove odd-positioned bits from the binary expansion of n.
 * @author Georg Fischer
 */
public class A063694 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN & 0x55555555);
  }
}
