package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a028.A028989;

/**
 * A056732 Smallest palindromic prime using n digits, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A056732 extends A028989 {

  private int mN = 0;

  @Override
  public Z next() {
    return (++mN & 1) == 1 ? super.next() : (mN == 2 ? Z.valueOf(11) : Z.ZERO);
  }
}
