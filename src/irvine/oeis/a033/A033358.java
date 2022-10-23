package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033358 a(n) = floor(38/n).
 * @author Sean A. Irvine
 */
public class A033358 extends Sequence1 {

  private static final Z NUM = Z.valueOf(38);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

