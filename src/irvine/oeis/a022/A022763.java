package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007520;
import irvine.oeis.a007.A007521;

/**
 * A022763 n-th 8k+3 prime plus n-th 8k+5 prime.
 * @author Sean A. Irvine
 */
public class A022763 extends Sequence1 {

  private final Sequence mA = new A007520();
  private final Sequence mB = new A007521();

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
