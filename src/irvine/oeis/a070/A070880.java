package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a088.A088314;

/**
 * A070880 Consider the 2^(n-1)-1 nonempty subsets S of {1, 2, ..., n-1}; a(n) gives number of such S for which it is impossible to partition n into parts from S such that each s in S is used at least once.
 * @author Sean A. Irvine
 */
public class A070880 extends Sequence1 {

  private int mN = -1;
  private final Sequence mA = new A088314().skip();

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(mA.next());
  }
}
