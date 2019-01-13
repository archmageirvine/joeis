package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000201;

/**
 * A001950.
 * @author Sean A. Irvine
 */
public class A001950 extends A000201 {

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}
