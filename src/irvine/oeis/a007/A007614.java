package irvine.oeis.a007;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000010;
import irvine.util.Pair;

/**
 * A007614 All values attained by the phi(n) function, in ascending order.
 * @author Sean A. Irvine
 */
public class A007614 extends A000010 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;
  private long mP = 1;
  private Z mPrimorial = Z.ONE;
  private final TreeSet<Pair<Z, Z>> mA = new TreeSet<>((a, b) -> {
    final int c = a.left().compareTo(b.left());
    if (c != 0) {
      return c;
    }
    return a.right().compareTo(b.right());
  });
  private Z mNextCompute = Z.ZERO;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().left().compareTo(mNextCompute) >= 0) {
      mP = mPrime.nextPrime(mP);
      mPrimorial = mPrimorial.multiply(mP);
      while (mN.compareTo(mPrimorial) < 0) {
        mN = mN.add(1);
        mNextCompute = Functions.PHI.z(mN);
        mA.add(new Pair<>(mNextCompute, mN));
      }
    }
    return mA.pollFirst().left();
  }
}
