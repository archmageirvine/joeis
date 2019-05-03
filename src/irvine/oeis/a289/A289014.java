package irvine.oeis.a289;

import irvine.math.z.Z;
import irvine.nt.homeprime.ReverseHomePrime;
import irvine.oeis.Sequence;

/**
 * A289014 Number of integers containing n in their <code>base-10</code> home prime trajectory.
 * @author Sean A. Irvine
 */
public class A289014 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(ReverseHomePrime.homePrimeTree(mN, 10).size());
  }
}
