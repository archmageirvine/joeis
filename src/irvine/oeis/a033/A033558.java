package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033558 <code>a(n) = 2n -</code> {smallest prime <code>&gt; n}</code>.
 * @author Sean A. Irvine
 */
public class A033558 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN - mPrime.nextPrime(mN));
  }
}
