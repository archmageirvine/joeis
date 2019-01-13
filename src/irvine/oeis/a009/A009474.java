package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009474.
 * @author Sean A. Irvine
 */
public class A009474 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN) + String.valueOf(9 * mN));
  }
}
