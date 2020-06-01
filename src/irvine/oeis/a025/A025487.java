package irvine.oeis.a025;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025487 Least integer of each prime signature <code>A124832;</code> also products of primorial numbers <code>A002110</code>.
 * @author Sean A. Irvine
 */
public class A025487 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final Fast mPrime = new Fast();
  private Z mLimit = Z.ONE;
  private int mN = -1;

  private void step() {
    if (++mN == 0) {
      mA.add(Z.ONE);
      return;
    }
    final IntegerPartition part = new IntegerPartition(mN);
    int[] p;
    while ((p = part.next()) != null) {
      Z prod = Z.ONE;
      Z prime = Z.ONE;
      for (final int e : p) {
        prime = mPrime.nextPrime(prime);
        prod = prod.multiply(prime.pow(e));
      }
      mA.add(prod);
    }
    mLimit = mLimit.multiply2();
  }

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.first().compareTo(mLimit) > 0) {
      step();
    }
    return mA.pollFirst();
  }
}

