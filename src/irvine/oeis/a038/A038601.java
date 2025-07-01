package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A038601 Prime numbers p such that the number of partitions of p is also a prime.
 * @author Sean A. Irvine
 */
public class A038601 extends AbstractSequence {

  /** Construct the sequence. */
  public A038601() {
    super(1);
  }

  protected final Fast mPrime = new Fast();
  protected Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Functions.PARTITIONS.z(mP).isProbablePrime()) {
        return mP;
      }
    }
  }
}
