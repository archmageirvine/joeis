package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007088.
 * @author Sean A. Irvine
 */
public class A007088 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(++mN));
  }
}
