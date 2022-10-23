package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033337 a(n) = floor(17/n).
 * @author Sean A. Irvine
 */
public class A033337 extends Sequence1 {

  private static final Z NUM = Z.valueOf(17);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

