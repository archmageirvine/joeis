package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a001.A001944;

/**
 * A004433 Numbers that are the sum of 4 distinct nonzero squares: of form w^2+x^2+y^2+z^2 with 0&lt;w&lt;x&lt;y&lt;z.
 * @author Sean A. Irvine
 */
public class A004433 extends A001944 {

  @Override
  protected Z init() {
    return Z.ONE;
  }
}
