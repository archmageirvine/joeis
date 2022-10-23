package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033331 a(n) = floor(11/n).
 * @author Sean A. Irvine
 */
public class A033331 extends Sequence1 {

  private static final Z NUM = Z.valueOf(11);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

