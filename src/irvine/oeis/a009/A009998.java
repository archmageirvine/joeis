package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009998 Triangle in which j-th entry in i-th row is (j+1)^(i-j).
 * @author Sean A. Irvine
 */
public class A009998 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mM + 1).pow(mN - mM);
  }
}
