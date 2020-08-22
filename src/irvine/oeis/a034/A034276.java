package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;

/**
 * A034276 Smallest prime that generates a prime pyramid of height n.
 * @author Sean A. Irvine
 */
public class A034276 implements Sequence {

  private final DynamicLongArray mA = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private long mP = 1;
  private int mN = -1;

  private int pyramidHeight(final String s) {
    final String n1 = "1" + s + "1";
    if (new Z(n1).isProbablePrime()) {
      return 1 + pyramidHeight(n1);
    }
    final String n3 = "3" + s + "3";
    if (new Z(n3).isProbablePrime()) {
      return 1 + pyramidHeight(n3);
    }
    final String n7 = "7" + s + "7";
    if (new Z(n7).isProbablePrime()) {
      return 1 + pyramidHeight(n7);
    }
    final String n9 = "9" + s + "9";
    if (new Z(n9).isProbablePrime()) {
      return 1 + pyramidHeight(n9);
    }
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      mP = mPrime.nextPrime(mP);
      final int h = pyramidHeight(String.valueOf(mP));
      if (mA.get(h) == 0) {
        mA.set(h, mP);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}

