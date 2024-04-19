package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002144;
import irvine.oeis.a002.A002145;

/**
 * A022757 n-th 4k+1 prime plus n-th 4k+3 prime.
 * @author Sean A. Irvine
 */
public class A022757 extends Sequence1 {

  private final Sequence mA = new A002144();
  private final Sequence mB = new A002145();

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
