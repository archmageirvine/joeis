package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077741 Smallest multiple of n which begins with R(n) and ends in n where R(n) (A004086) is the digit reversal of n. Suitable number of zeros are assumed to the left of the MSD if required.
 * @author Sean A. Irvine
 */
public class A077741 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final String s = String.valueOf(mN);
    final String r = String.valueOf(Functions.REVERSE.l(mN));
    long m = 0;
    while (true) {
      m += mN;
      final String t = String.valueOf(m);
      if (t.startsWith(r) && t.endsWith(s)) {
        return Z.valueOf(m);
      }
    }
  }
}
