package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a381.A381054;

/**
 * A383115 a(n) is the number of values m that satisfy floor(sqrt(m)) = n and A381054(m) = 1.
 * @author Sean A. Irvine
 */
public class A383115 extends Sequence1 {

  private final A381054 mSeq = new A381054();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = mN * mN; k <= mN * mN + 2 * mN; ++k) {
      if (mSeq.a(Z.valueOf(k)).isOne()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
