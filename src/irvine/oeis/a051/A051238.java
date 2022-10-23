package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051238 First appearance of string n in e.
 * @author Sean A. Irvine
 */
public class A051238 extends Sequence1 {

  private static final CR E10 = CR.E.divide(CR.TEN);
  private int mM = 100;
  private String mA = E10.toString(mM);
  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    int t;
    while ((t = mA.indexOf(s)) == -1) {
      mM *= 2;
      mA = E10.toString(mM);
    }
    return Z.valueOf(t - 1);
  }
}
