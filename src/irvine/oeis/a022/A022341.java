package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a003.A003714;

/**
 * A022341 Odd Fibbinary numbers; also 4*Fibbinary(n) + 1.
 * @author Sean A. Irvine
 */
public class A022341 extends A003714 {

  @Override
  public Z next() {
    return super.next().multiply(4).add(1);
  }
}
