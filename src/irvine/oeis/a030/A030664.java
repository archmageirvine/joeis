package irvine.oeis.a030;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A030664 Product of largest prime &lt;= n and smallest prime &gt;= n.
 * @author Sean A. Irvine
 */
public class A030664 extends AbstractSequence {

  /** Construct the sequence. */
  public A030664() {
    super(0);
  }

  private final Fast mPrime = new Fast();
  protected long mN = -1;

  @Override
  public Z next() {
    return ++mN < 2 ? Z.ONE : Z.valueOf(mPrime.prevPrime(mN + 1)).multiply(mPrime.nextPrime(mN - 1));
  }
}

