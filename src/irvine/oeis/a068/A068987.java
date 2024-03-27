package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068987 a(n) is the first position in the digit sequence 3,1,4,1,5,9,.... of Pi where the pattern "1,2,...,n" occurs (where position of the initial 3 is 1).
 * @author Sean A. Irvine
 */
public class A068987 extends Sequence1 {

  private final StringBuilder mC = new StringBuilder();
  private String mPi = "";
  private int mN = 0;
  private int mDigits = 10;

  @Override
  public Z next() {
    mC.append(++mN);
    final String q = mC.toString();
    int pos;
    while ((pos = mPi.indexOf(q)) < 0) {
      mDigits *= 2;
      mPi = CR.PI.toString(mDigits);
    }
    return Z.valueOf(pos);
  }
}
