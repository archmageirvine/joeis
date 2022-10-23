package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033374 a(n) = floor(54/n).
 * @author Sean A. Irvine
 */
public class A033374 extends Sequence1 {

  private static final Z NUM = Z.valueOf(54);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

