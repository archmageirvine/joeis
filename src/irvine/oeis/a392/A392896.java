package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392896 allocated for Firdous Ahmad Mala.
 * @author Sean A. Irvine
 */
public class A392896 extends Sequence1 {

  private CR mSum = CR.ZERO;
  private long mM = 1;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mSum.compareTo(CR.valueOf(mN)) < 0) {
      mSum = mSum.add(CR.valueOf(++mM).log().inverse());
    }
    return Z.valueOf(mM);
  }
}
