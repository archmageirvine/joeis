package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033356 a(n) = floor(36/n).
 * @author Sean A. Irvine
 */
public class A033356 extends Sequence1 {

  private static final Z NUM = Z.valueOf(36);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

