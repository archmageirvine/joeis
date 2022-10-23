package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033390 a(n) = floor(70/n).
 * @author Sean A. Irvine
 */
public class A033390 extends Sequence1 {

  private static final Z NUM = Z.valueOf(70);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

