package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033386 a(n) = floor(66/n).
 * @author Sean A. Irvine
 */
public class A033386 extends Sequence1 {

  private static final Z NUM = Z.valueOf(66);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

