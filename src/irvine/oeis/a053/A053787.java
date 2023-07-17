package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000584;

/**
 * A053787 Nextprime(n^5) - n^5.
 * @author Sean A. Irvine
 */
public class A053787 extends A000584 {

  /** Construct the sequence. */
  public A053787() {
    super(1);
  }

  private final Fast mPrime = new Fast();

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z n5 = super.next();
    return mPrime.nextPrime(n5).subtract(n5);
  }
}
