package irvine.oeis.a387;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080662.
 * @author Sean A. Irvine
 */
public class A387143 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Z> mUsed = new HashSet<>();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      if (!mUsed.contains(p) && p.pow(mN).toString().contains(p.toString())) {
        mUsed.add(p);
        return p;
      }
    }
  }
}
