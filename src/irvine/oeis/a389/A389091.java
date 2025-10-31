package irvine.oeis.a389;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389091 Sum over i of the i-th digit of n raised to the i-th power.
 * @author Sean A. Irvine
 */
public class A389091 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    return Integers.SINGLETON.sum(0, s.length() - 1, k -> Z.valueOf(s.charAt(k) - '0').pow(k + 1));
  }
}
