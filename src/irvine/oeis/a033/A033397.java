package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033397 a(n) = floor(77/n).
 * @author Sean A. Irvine
 */
public class A033397 extends Sequence1 {

  private static final Z NUM = Z.valueOf(77);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

