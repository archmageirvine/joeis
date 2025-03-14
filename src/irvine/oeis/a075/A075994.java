package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075994 Irregular triangle T(n,k) = floor(n/k) for k = 1, 2, ..., floor(n/2) for n&gt;=2 and T(1,1)=1.
 * @author Sean A. Irvine
 */
public class A075994 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (2 * ++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN / mM);
  }
}
