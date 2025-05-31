package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077581 Triangle in which row n contains the n smallest numbers starting from 1 and coprime to n.
 * @author Sean A. Irvine
 */
public class A077581 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mK = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mK = 0;
    }
    while (true) {
      if (Functions.GCD.l(++mK, mN) == 1) {
        return Z.valueOf(mK);
      }
    }
  }
}
