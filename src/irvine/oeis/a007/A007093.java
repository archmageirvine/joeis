package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007093 Numbers in base 7.
 * @author Sean A. Irvine
 */
public class A007093 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 7));
  }
}
