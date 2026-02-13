package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083789 Diagonal of A083788.
 * @author Sean A. Irvine
 */
public class A083789 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mLen = 0;

  @Override
  public Z next() {
    ++mN;
    while (mN > mLen) {
      mLen = A083788.getLength(++mM);
    }
    return Z.valueOf(mM + mN - 1);
  }
}
