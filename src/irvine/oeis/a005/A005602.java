package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;

/**
 * A005602 Smallest prime beginning a complete Cunningham chain of length <code>n</code> (of the first kind).
 * @author Sean A. Irvine
 */
public class A005602 implements Sequence {

  private final Fast mPrime = new Fast();
  private final DynamicArray<Z> mFirst = new DynamicArray<>();
  private int mChainLength = 0;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    ++mChainLength;
    while (mFirst.get(mChainLength) == null) {
      mP = mPrime.nextPrime(mP);
      // Make sure mP is the first element of a chain
      final Z q = mP.subtract(1).divide2();
      if (!q.isProbablePrime()) {
        // Run forwards to determine chain length
        int length = 0;
        Z r = mP;
        do {
          ++length;
          r = r.multiply2().add(1);
        } while (r.isProbablePrime());
        if (mFirst.get(length) == null) {
          mFirst.set(length, mP);
        }
      }
    }
    return mFirst.get(mChainLength);
  }
}

