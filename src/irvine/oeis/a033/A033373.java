package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033373 a(n) = floor(53/n).
 * @author Sean A. Irvine
 */
public class A033373 extends Sequence1 {

  private static final Z NUM = Z.valueOf(53);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

