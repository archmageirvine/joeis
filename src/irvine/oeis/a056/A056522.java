package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a285.A285037;

/**
 * A056522 Number of primitive (period n) periodic palindromic structures using exactly five different symbols.
 * @author Sean A. Irvine
 */
public class A056522 extends A285037 {

  private int mN = 0;

  @Override
  public Z next() {
    return get(++mN, 5);
  }
}
