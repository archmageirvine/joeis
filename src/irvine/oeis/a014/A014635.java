package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014635.
 * @author Sean A. Irvine
 */
public class A014635 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(4 * mN - 1).multiply2();
  }
}
