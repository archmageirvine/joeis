package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033334 a(n) = floor(14/n).
 * @author Sean A. Irvine
 */
public class A033334 extends Sequence1 {

  private static final Z NUM = Z.valueOf(14);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

