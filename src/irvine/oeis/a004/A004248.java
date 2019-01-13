package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004248.
 * @author Sean A. Irvine
 */
public class A004248 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 0;
      ++mN;
    }
    return Z.valueOf(mM).pow(mN - mM);
  }
}
