package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075401 Smallest nontrivial multiple of n (&gt; n and not equal to 10^k*n) whose digit sum is a multiple of the digit sum of n.
 * @author Sean A. Irvine
 */
public class A075401 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long s = Functions.DIGIT_SUM.l(++mN);
    long t = mN;
    long nope = mN * 10;
    while (true) {
      t += mN;
      if (t == nope) {
        nope *= 10;
      } else if (Functions.DIGIT_SUM.l(t) % s == 0) {
        return Z.valueOf(t);
      }
    }
  }
}
