package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a285.A285012;

/**
 * A056508 Number of periodic palindromic structures of length n using exactly two different symbols.
 * @author Sean A. Irvine
 */
public class A056508 extends A285012 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 2);
  }
}
