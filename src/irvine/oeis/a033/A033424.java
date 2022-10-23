package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033424 a(n) = floor(10^8/n).
 * @author Sean A. Irvine
 */
public class A033424 extends Sequence1 {

  private static final Z NUM = Z.valueOf(100000000);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

