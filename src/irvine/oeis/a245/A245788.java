package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A245788 n times the number of 1's in the binary expansion of n.
 * @author Sean A. Irvine
 */
public class A245788 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN * Long.bitCount(mN));
  }
}
