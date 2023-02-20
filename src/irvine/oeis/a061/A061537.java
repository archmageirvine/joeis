package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a034.A034444;

/**
 * A061537 Product of unitary divisors of n.
 * @author Georg Fischer
 */
public class A061537 extends Sequence1 {

  private final Sequence mA034444 = new A034444();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mA034444.next().divide2());
  }

}
