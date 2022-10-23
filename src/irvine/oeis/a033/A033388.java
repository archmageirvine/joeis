package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033388 a(n) = floor(68/n).
 * @author Sean A. Irvine
 */
public class A033388 extends Sequence1 {

  private static final Z NUM = Z.valueOf(68);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

