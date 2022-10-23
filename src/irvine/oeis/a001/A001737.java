package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001737 Squares written in base 2.
 * @author Sean A. Irvine
 */
public class A001737 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Z.valueOf(++mN).square().toString(2));
  }

}
