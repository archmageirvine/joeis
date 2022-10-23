package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033398 a(n) = floor(78/n).
 * @author Sean A. Irvine
 */
public class A033398 extends Sequence1 {

  private static final Z NUM = Z.valueOf(78);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

