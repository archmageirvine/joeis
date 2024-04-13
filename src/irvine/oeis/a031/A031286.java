package irvine.oeis.a031;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A031286 Additive persistence: number of summations of digits needed to obtain a single digit (the additive digital root).
 * @author Sean A. Irvine
 */
public class A031286 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m > 9) {
      ++cnt;
      m = Functions.DIGIT_SUM.l(m);
    }
    return Z.valueOf(cnt);
  }
}

