package irvine.oeis.a088;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A088576 Position of the first location of n in the decimal expansion of e.
 * @author Sean A. Irvine
 */
public class A088576 implements Sequence {

  private static final CR E10 = CR.E.divide(CR.TEN);
  private int mM = 100;
  private String mA = E10.toString(mM);
  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    int t;
    while ((t = mA.indexOf(s, 1)) == -1) {
      mM *= 2;
      mA = E10.toString(mM);
    }
    return Z.valueOf(t - 1);
  }
}
