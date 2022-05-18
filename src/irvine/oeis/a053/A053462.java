package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053462 Number of positive squarefree integers less than 10^n.
 * @author Sean A. Irvine
 */
public class A053462 implements Sequence {

  private long mN = 0;
  private long mLim = 1;
  private long mC = 0;

  @Override
  public Z next() {
    while (true) {
      if (mN + 1 == mLim) {
        mLim *= 10;
        return Z.valueOf(mC);
      }
      if (Jaguar.factor(++mN).isSquareFree()) {
        ++mC;
      }
    }
  }
}
