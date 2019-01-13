package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014107.
 * @author Sean A. Irvine
 */
public class A014107 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(2 * mN - 3);
  }
}
