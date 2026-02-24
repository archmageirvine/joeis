package irvine.oeis.a083;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083872 Triangle read by rows in which row n lists first appearance of m such that m divides n!.
 * @author Sean A. Irvine
 */
public class A083872 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private int mN = 0;
  private Z mF = Z.ONE;
  private Z[] mD = {};
  private int mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mD.length) {
        mF = mF.multiply(++mN);
        mD = Jaguar.factor(mF).divisorsSorted();
        mM = 0;
      }
      if (mUsed.add(mD[mM])) {
        return mD[mM];
      }
    }
  }
}
