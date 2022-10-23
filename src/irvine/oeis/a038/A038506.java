package irvine.oeis.a038;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038506 Floor of decimal expansion of n read as if it were "base e".
 * @author Sean A. Irvine
 */
public class A038506 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    CR sum = CR.ZERO;
    CR e = CR.ONE;
    while (m != 0) {
      sum = sum.add(e.multiply(m % 10));
      m /= 10;
      e = e.multiply(CR.E);
    }
    return sum.floor();
  }
}
