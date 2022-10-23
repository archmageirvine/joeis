package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033339 a(n) = floor(19/n).
 * @author Sean A. Irvine
 */
public class A033339 extends Sequence1 {

  private static final Z NUM = Z.valueOf(19);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

