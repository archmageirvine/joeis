package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007094 Numbers in base 8.
 * @author Sean A. Irvine
 */
public class A007094 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 8));
  }
}
