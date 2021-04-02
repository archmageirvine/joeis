package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046107 Triangle of prime numbers in which n-th row lists all primes p such that 1/p has decimal period n, n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A046107 implements Sequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mT = mT.multiply(10);
      for (final Z p : Jaguar.factor(mT.subtract(1)).toZArray()) {
        if (mSeen.add(p)) {
          mA.add(p);
        }
      }
    }
    return mA.pollFirst();
  }
}
