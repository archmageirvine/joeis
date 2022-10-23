package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007090 Numbers in base 4.
 * @author Sean A. Irvine
 */
public class A007090 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 4));
  }
}
