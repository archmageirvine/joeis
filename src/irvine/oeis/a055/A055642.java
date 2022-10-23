package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055642 Number of digits in decimal expansion of n.
 * @author Sean A. Irvine
 */
public class A055642 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(1 + (long) Math.floor(Math.log10(mN)));
  }
}

