package irvine.oeis.a214;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A214877 n ^ (last digit of n).
 * @author Georg Fischer
 */
public class A214877 implements Sequence {

  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN % 10);
  }
}
