package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A073487 Squarefree numbers having exactly one prime gap.
 * @author Sean A. Irvine
 */
public class A073487 extends A005117 {

  private final Fast mPrime = new Fast();
  private final int mNumGaps;

  protected A073487(final int numGaps) {
    mNumGaps = numGaps;
  }

  /** Construct the sequence. */
  public A073487() {
    this(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final Z[] p = Jaguar.factor(n).toZArray();
      if (p.length > 1) {
        int cnt = 0;
        boolean wasGap = false;
        for (Z q = mPrime.nextPrime(p[0]); q.compareTo(p[p.length - 1]) < 0; q = mPrime.nextPrime(q)) {
          if (!n.mod(q).isZero()) {
            if (!wasGap) {
              if (++cnt > mNumGaps) {
                break;
              }
              wasGap = true;
            }
          } else {
            wasGap = false;
          }
        }
        if (cnt == mNumGaps) {
          return n;
        }
      }
    }
  }
}
