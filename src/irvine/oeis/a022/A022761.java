package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007519;
import irvine.oeis.a007.A007522;

/**
 * A022761 n-th 8k+1 prime plus n-th 8k+7 prime.
 * @author Sean A. Irvine
 */
public class A022761 implements Sequence {

  private Sequence mA = new A007519();
  private Sequence mB = new A007522();

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
