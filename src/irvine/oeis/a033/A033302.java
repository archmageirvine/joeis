package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033302 Largest prime &lt; largest prime &lt; n.
 * @author Sean A. Irvine
 */
public class A033302 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    return Z.valueOf(mPrime.prevPrime(mPrime.prevPrime(++mN)));
  }
}

