package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007092 Numbers in base 6.
 * @author Sean A. Irvine
 */
public class A007092 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 6));
  }
}
