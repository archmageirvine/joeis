package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000040.
 * @author Sean A. Irvine
 */
public class A000040 implements Sequence {

  private Z mP = Z.ONE;
  protected final Fast mFast = new Fast();

  @Override
  public Z next() {
    mP = mFast.nextPrime(mP);
    return mP;
  }
}

