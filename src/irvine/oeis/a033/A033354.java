package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033354 a(n) = floor(34/n).
 * @author Sean A. Irvine
 */
public class A033354 extends Sequence1 {

  private static final Z NUM = Z.valueOf(34);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

