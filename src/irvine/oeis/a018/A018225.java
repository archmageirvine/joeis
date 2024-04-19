package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a007.A007769;
import irvine.oeis.a317.A317184;

/**
 * A018225 Number of connected chord diagrams of degree n.
 * @author Sean A. Irvine
 */
public class A018225 extends A317184 {

  private final A007769 mA = new A007769();
  {
    mA.next(); // skip 0th
  }

  @Override
  public Z next() {
    return mA.next().subtract(super.next());
  }
}

