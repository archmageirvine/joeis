package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PositionOfNSequence;
import irvine.oeis.a006.A006556;
import irvine.oeis.a008.A008578;

/**
 * A054471 Smallest prime p having n different cycles in decimal expansions of k/p, k=1..p-1.
 * @author Sean A. Irvine
 */
public class A054471 extends PositionOfNSequence {

  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A008578());

  /** Construct the sequence. */
  public A054471() {
    super(new A006556(), 1, 3);
  }

  @Override
  public Z next() {
    final Z res = mPrimes.a(super.next().intValueExact());
    return Z.FIVE.equals(res) ? Z.THREE : res;
  }
}
