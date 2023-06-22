package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047895 Difference of decimal orders of Euler and Tangential numbers: deviations of Zigs and Zags.
 * @author Sean A. Irvine
 */
public class A047895 extends A047893 {

  private int mN = 0;
  private final Sequence mA = new A047894();

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z result = super.next().subtract(mA.next());
    return (++mN <= 1) ? Z.ZERO : result;
  }
}
