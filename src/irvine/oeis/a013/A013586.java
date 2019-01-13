package irvine.oeis.a013;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013586.
 * @author Sean A. Irvine
 */
public class A013586 implements Sequence {

  private int mN = 0;
  private long mP = 1;
  private final Fast mPrime = new Fast();
  private final ArrayList<Z> mPrimorials = new ArrayList<>();
  {
    mPrimorials.add(Z.ONE);
  }

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.TWO;
    }
    while (mP <= mN) {
      mP = mPrime.nextPrime(mP);
      mPrimorials.add(mPrimorials.get(mPrimorials.size() - 1).multiply(mP));
    }
    long p = 1;
    for (int m = 1; m < mPrimorials.size(); ++m) {
      p = mPrime.nextPrime(p);
      final Z v = mPrimorials.get(m);
      if (v.mod(mN) == 0 || v.subtract(1).mod(mN) == 0 || v.add(1).mod(mN) == 0) {
        return Z.valueOf(p);
      }
    }
    return Z.ZERO;
  }
}
