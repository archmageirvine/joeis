package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014634.
 * @author Sean A. Irvine
 */
public class A014634 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN + 1).multiply(4 * mN + 1);
  }
}
