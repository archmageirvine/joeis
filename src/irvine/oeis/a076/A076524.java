package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076524 For each solution x&gt;0 to 3*prime(n)+2*x = prime(n+2+x), the sequence lists prime(n) once.
 * @author Sean A. Irvine
 */
public class A076524 extends Sequence1 {

  private long mN = 2;
  private long mX = 0;

  @Override
  public Z next() {
    long p = Functions.PRIME.l(mN);
    long p3 = 3 * p;
    while (true) {
      ++mX;
      final long q = Functions.PRIME.l(mN + 2 + mX);
      final int c = Long.compare(q, p3 + 2 * mX);
      if (c == 0) {
        return Z.valueOf(p);
      }
      if (c > 0) {
        p = Functions.PRIME.l(++mN);
        p3 = 3 * p;
        mX = 0;
      }
    }
  }
}
