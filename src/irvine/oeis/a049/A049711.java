package irvine.oeis.a049;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A049711 a(n) = n - prevprime(n).
 * @author Sean A. Irvine
 */
public class A049711 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A049711(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A049711() {
    super(3);
  }

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(++mN - mPrime.prevPrime(mN));
  }
}
