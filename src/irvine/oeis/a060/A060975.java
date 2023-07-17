package irvine.oeis.a060;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000367;

/**
 * A060975 Irregular primes with irregularity index three.
 * @author Sean A. Irvine
 */
public class A060975 extends A000367 {

  /** Construct the sequence. */
  public A060975() {
    super(1);
  }

  private final ArrayList<Z> mB = new ArrayList<>();
  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      int c = 0;
      final long q = mP / 2;
      while (mB.size() < q) {
        mB.add(super.next());
      }
      for (int k = 1; k <= (mP - 3) / 2; ++k) {
        if (mB.get(k).mod(mP) == 0 && ++c > 3) {
          break;
        }
      }
      if (c == 3) {
        return Z.valueOf(mP);
      }
    }
  }
}
