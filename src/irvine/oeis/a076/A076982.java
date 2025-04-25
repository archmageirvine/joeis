package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076982 Number of triangular numbers that divide the n-th triangular number.
 * @author Sean A. Irvine
 */
public class A076982 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Functions.TRIANGULAR.z(++mN);
    long cnt = 1;
    for (long k = 1; k < mN; ++k) {
      if (t.mod(Functions.TRIANGULAR.z(k)).isZero()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

