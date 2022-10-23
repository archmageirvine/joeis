package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033355 a(n) = floor(35/n).
 * @author Sean A. Irvine
 */
public class A033355 extends Sequence1 {

  private static final Z NUM = Z.valueOf(35);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

