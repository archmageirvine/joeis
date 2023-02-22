package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a048.A048105;

/**
 * A061538 Product of all divisors of n, divided by product of unitary divisors; or equivalently product of non-unitary divisors of n.
 * @author Sean A. Irvine
 */
public class A061538 extends Sequence1 {

  private final Sequence mA = new A048105();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mA.next()).sqrt();
  }
}
