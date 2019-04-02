package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000812 Number of switching networks (see Harrison reference for precise definition).
 * @author Sean A. Irvine
 */
public class A000812 extends A000721 {

  @Override
  protected CycleIndex iZ2(final int r) {
    final CycleIndex iz = new CycleIndex("I(Z(2))");
    iz.add(ia1(r));
    return iz;
  }

  @Override
  public Z next() {
    final CycleIndex ans = f(++mN);
    return ans.apply(3).toZ();
  }
}
