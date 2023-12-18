package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067457 Smallest n-th power starting with n.
 * @author Sean A. Irvine
 */
public class A067457 extends Sequence1 {

  private static final CR LOG10 = CR.TEN.log();
  private long mN = 0;

  @Override
  public Z next() {
    Z k = CR.valueOf(++mN).log().divide(LOG10).floor().add(1);
    final String s = String.valueOf(mN);
    while (true) {
      final Z t = k.pow(mN);
      if (t.toString().startsWith(s)) {
        return t;
      }
      k = k.add(1);
    }
  }
}

