package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a018.A018191;

/**
 * A054938 Number of chiral chord diagrams on n nodes.
 * @author Sean A. Irvine
 */
public class A054938 extends A054499 {

  private final Sequence mA = new A018191();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
