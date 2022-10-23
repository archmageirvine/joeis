package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033413 a(n) = floor(93/n).
 * @author Sean A. Irvine
 */
public class A033413 extends Sequence1 {

  private static final Z NUM = Z.valueOf(93);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

