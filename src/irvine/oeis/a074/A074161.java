package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074161 Smallest multiple of n (&gt;n) using all composite digits (4,6,8,9 and 0).
 * @author Sean A. Irvine
 */
public class A074161 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while (true) {
      m += mN;
      if ((Functions.SYNDROME.i(m) & 0b0010101110) == 0) {
        return Z.valueOf(m);
      }
    }
  }
}
