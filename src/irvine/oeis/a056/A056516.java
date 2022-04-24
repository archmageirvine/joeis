package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a285.A285037;

/**
 * A056516 Number of primitive (period n) periodic palindromic structures using a maximum of five different symbols.
 * @author Sean A. Irvine
 */
public class A056516 extends A285037 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, 5).add(get(mN, 4)).add(get(mN, 3)).add(get(mN, 2)).add(get(mN, 1));
  }
}
