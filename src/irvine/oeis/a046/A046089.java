package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a030.A030523;

/**
 * A046089 Triangle read by rows, the Bell transform of (n+2)!/2 without column 0.
 * @author Sean A. Irvine
 */
public class A046089 extends A030523 {


  @Override
  public Z next() {
    return super.next().multiply(Functions.FACTORIAL.z(mN)).shiftRight(mN - mM).divide(Functions.FACTORIAL.z(mM));
  }
}
