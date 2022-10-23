package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009999 Triangle in which j-th entry in i-th row is (i+1-j)^j, 0&lt;=j&lt;=i.
 * @author Sean A. Irvine
 */
public class A009999 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mN + 1 - mM).pow(mM);
  }
}
