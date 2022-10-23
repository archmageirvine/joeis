package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033362 a(n) = floor(42/n).
 * @author Sean A. Irvine
 */
public class A033362 extends Sequence1 {

  private static final Z NUM = Z.valueOf(42);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

