package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085567 Least m such that the average number of divisors of all integers from 1 to m equals n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A085567 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;
  private Z mSum = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final long t = mSum.mod(mM);
      if (t == 0) {
        final Z v = mSum.divide(mM);
        final int c = v.compareTo(mN);
        if (c >= 0) {
          return c == 0 ? Z.valueOf(mM) : Z.ZERO;
        }
      }
      mSum = mSum.add(Functions.SIGMA0.l(++mM));
    }
  }
}
