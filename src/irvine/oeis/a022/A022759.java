package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002476;
import irvine.oeis.a007.A007528;

/**
 * A022759 n-th 6k+1 prime plus n-th 6k+5 prime.
 * @author Sean A. Irvine
 */
public class A022759 extends Sequence1 {

  private final Sequence mA = new A002476();
  private final Sequence mB = new A007528();

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
