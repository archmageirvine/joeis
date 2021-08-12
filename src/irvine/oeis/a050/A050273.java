package irvine.oeis.a050;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050273 Smallest value a for Diophantine 1-triples (a,b,c) ordered by smallest c,b.
 * @author Sean A. Irvine
 */
public class A050273 implements Sequence {

  private long mC = 2;
  private long mB = 1;
  private long mA = 1;

  private boolean isSquare(final long n) {
    final long s = LongUtils.sqrt(n);
    return s * s == n;
  }

  protected Z select(final long a, final long b, final long c) {
    return Z.valueOf(a);
  }

  @Override
  public Z next() {
    while (true) {
      if (--mA < 1) {
        do {
          if (--mB < 2) {
            mB = mC;
            ++mC;
          }
        } while (!isSquare(mB * mC + 1));
        mA = mB - 1;
      }
      if (isSquare(mB * mA + 1) && isSquare(mC * mA + 1)) {
        //System.out.println("(" + mA + "," + mB + "," + mC + ")");
        return select(mA, mB, mC);
      }
    }
  }
}

