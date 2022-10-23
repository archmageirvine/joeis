package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033414 a(n) = floor(94/n).
 * @author Sean A. Irvine
 */
public class A033414 extends Sequence1 {

  private static final Z NUM = Z.valueOf(94);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

