package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a245.A245499;

/**
 * A066400 Smallest values of t arising in R. L. Graham's sequence (A006255).
 * @author Sean A. Irvine
 */
public class A066400 extends A245499 {

  @Override
  public Z next() {
    step();
    return Z.valueOf(mA.size());
  }
}
