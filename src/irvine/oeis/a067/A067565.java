package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.InverseSequence;
import irvine.oeis.a006.A006255;

/**
 * A067520.
 * @author Sean A. Irvine
 */
public class A067565 extends InverseSequence {

  private final Fast mPrime = new Fast();

  /** Construct the sequence. */
  public A067565() {
    super(1, new A006255(), 1);
  }

  @Override
  public Z next() {
    if (mPrime.isPrime(mN + 1)) {
      ++mN;
      return Z.ZERO;
    }
    return super.next();
  }
}

