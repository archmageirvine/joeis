package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074156 Smallest multiple of n with initial digits that of the reversal of n, deleting the leading zeros wherever required.
 * @author Sean A. Irvine
 */
public class A074156 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(Functions.REVERSE.l(++mN));
    long m = mN;
    while (!String.valueOf(m).startsWith(s)) {
      m += mN;
    }
    return Z.valueOf(m);
  }
}
