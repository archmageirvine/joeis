package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001359;
import irvine.oeis.a006.A006512;

/**
 * A077800 List of twin primes {p, p+2}.
 * @author Georg Fischer
 */
public class A077800 extends Sequence1 {

  private int mN = -1;
  private Sequence mSeqA = new A001359();
  private Sequence mSeqB = new A006512();

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 0) ? mSeqA.next() : mSeqB.next();
  }
}
