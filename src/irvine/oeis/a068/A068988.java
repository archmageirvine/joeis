package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068988 a(n) = first position in the decimal expansion of e where the pattern "1,2,...,n" occurs.
 * @author Sean A. Irvine
 */
public class A068988 extends Sequence1 {

  private final StringBuilder mC = new StringBuilder();
  private String mE = "";
  private int mN = 0;
  private int mDigits = 10;

  @Override
  public Z next() {
    mC.append(++mN);
    final String q = mC.toString();
    int pos;
    while ((pos = mE.indexOf(q)) < 0) {
      mDigits *= 2;
      mE = CR.E.toString(mDigits);
    }
    return Z.valueOf(pos);
  }
}
