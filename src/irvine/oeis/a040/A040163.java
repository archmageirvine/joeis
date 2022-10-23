package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A040163 a(n) is the absolute value of (the first digit of n minus the last digit of n).
 * @author Sean A. Irvine
 */
public class A040163 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    return Z.valueOf(Math.abs(s.charAt(0) - s.charAt(s.length() - 1)));
  }
}
