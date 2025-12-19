package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006450;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A082676 Constant term of polynomial of degree n passing through the first n+1 consecutive prime-indexed primes.
 * @author Sean A. Irvine
 */
public class A082676 extends Sequence1 {

  private final Sequence mA = new InverseBinomialTransformSequence(1, new A006450(), 0);
  private Z mSum = Z.ZERO;
  private long mSign = -1;
  {
    skip();
  }

  @Override
  public Z next() {
    mSign = -mSign;
    mSum = mSum.add(mA.next().multiply(mSign));
    return mSum;
  }
}
