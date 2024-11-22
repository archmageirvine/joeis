package irvine.oeis.a073;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000367;

/**
 * A073276 Irregular primes (A000928) with irregularity index one.
 * @author Sean A. Irvine
 */
public class A073276 extends A000367 {

  private final int mIrregularityIndex;
  private final ArrayList<Z> mB = new ArrayList<>();
  private final Fast mPrime = new Fast();
  private long mP = 2;

  protected A073276(final int irregularityIndex) {
    super(1);
    mIrregularityIndex = irregularityIndex;
  }

  /** Construct the sequence. */
  public A073276() {
    this(1);
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long q = mP / 2;
      while (mB.size() < q) {
        mB.add(super.next());
      }
      int cnt = 0;
      for (int k = 1; k <= (mP - 3) / 2; ++k) {
        if (mB.get(k).mod(mP) == 0 && ++cnt > mIrregularityIndex) {
          break;
        }
      }
      if (cnt == mIrregularityIndex) {
        return Z.valueOf(mP);
      }
    }
  }
}
