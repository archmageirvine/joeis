package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051933 Triangle T(n,m) = Nim-sum (or XOR) of n and m, read by rows, 0&lt;=m&lt;=n.
 * @author Sean A. Irvine
 */
public class A051933 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mN ^ mM);
  }
}
