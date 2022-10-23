package irvine.oeis.a214;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A214877 n ^ (last digit of n).
 * @author Georg Fischer
 */
public class A214877 extends Sequence0 {

  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN % 10);
  }
}
