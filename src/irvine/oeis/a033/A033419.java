package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033419 a(n) = floor(99/n).
 * @author Sean A. Irvine
 */
public class A033419 extends Sequence1 {

  private static final Z NUM = Z.valueOf(99);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

