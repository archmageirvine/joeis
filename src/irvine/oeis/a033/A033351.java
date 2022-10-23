package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033351 a(n) = floor(31/n).
 * @author Sean A. Irvine
 */
public class A033351 extends Sequence1 {

  private static final Z NUM = Z.valueOf(31);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

