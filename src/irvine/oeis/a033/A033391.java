package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033391 a(n) = floor(71/n).
 * @author Sean A. Irvine
 */
public class A033391 extends Sequence1 {

  private static final Z NUM = Z.valueOf(71);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

