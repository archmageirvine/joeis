package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002260 Triangle <code>T(n,k) =</code> k for k <code>= 1..n</code>.
 * @author Sean A. Irvine
 */
public class A002260 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mM);
  }
}
