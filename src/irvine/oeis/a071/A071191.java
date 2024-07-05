package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071191 Least m&gt;n such that the number of prime factors of m and n differ at most by 1.
 * @author Sean A. Irvine
 */
public class A071191 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long k = ++mN;
    final long t = Functions.BIG_OMEGA.l(mN);
    while (true) {
      if (Math.abs(t - Functions.BIG_OMEGA.l(++k)) <= 1) {
        return Z.valueOf(k);
      }
    }
  }
}
