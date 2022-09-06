package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058935 Concatenation of first n binary numbers.
 * @author Sean A. Irvine
 */
public class A058935 implements Sequence {

  private final StringBuilder mA = new StringBuilder();
  private long mN = -1;

  @Override
  public Z next() {
    mA.append(Long.toBinaryString(++mN));
    return new Z(mA);
  }
}
