package irvine.oeis.a049;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A049711 a(n) = n - prevprime(n).
 * @author Sean A. Irvine
 */
public class A049711 extends AbstractSequence implements DirectSequence {

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

  @Override
  public Z a(final Z n) {
    return n.subtract(Functions.PREV_PRIME.z(n));
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).subtract(Functions.PREV_PRIME.z(n));
  }

}
