package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058935 Concatenation of first n binary numbers.
 * @author Sean A. Irvine
 */
public class A058935 extends Sequence0 {

  private final StringBuilder mA = new StringBuilder();
  private long mN = -1;

  @Override
  public Z next() {
    mA.append(Long.toBinaryString(++mN));
    return new Z(mA);
  }
}
