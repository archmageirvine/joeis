package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078240 a(n) = smallest multiple of n using only composite digits (0,4,6,8,9).
 * @author Sean A. Irvine
 */
public class A078240 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long t = mN;
    while (true) {
      if ((Functions.SYNDROME.i(t) & 0b0010101110) == 0) {
        return Z.valueOf(t);
      }
      t += mN;
    }
  }
}

