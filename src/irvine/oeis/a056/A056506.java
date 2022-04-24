package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a285.A285012;

/**
 * A056506 Number of periodic palindromic structures using a maximum of five different symbols.
 * @author Sean A. Irvine
 */
public class A056506 extends A285012 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 5).add(t(mN, 4)).add(t(mN, 3)).add(t(mN, 2)).add(t(mN, 1));
  }
}
