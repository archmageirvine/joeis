package irvine.oeis.a289;

import irvine.math.z.Z;
import irvine.nt.homeprime.ReverseHomePrime;
import irvine.oeis.Sequence1;

/**
 * A289014 Number of integers containing n in their base-10 home prime trajectory.
 * @author Sean A. Irvine
 */
public class A289014 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(ReverseHomePrime.homePrimeTree(mN, 10).size());
  }
}
