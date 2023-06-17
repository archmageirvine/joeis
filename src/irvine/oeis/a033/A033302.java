package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A033302 Largest prime &lt; largest prime &lt; n.
 * @author Sean A. Irvine
 */
public class A033302 extends AbstractSequence {

  /* Construct the sequence. */
  public A033302() {
    super(4);
  }

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    return Z.valueOf(mPrime.prevPrime(mPrime.prevPrime(++mN)));
  }
}

