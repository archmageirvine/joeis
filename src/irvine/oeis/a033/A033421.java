package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033421 a(n) = floor(1000/n).
 * @author Sean A. Irvine
 */
public class A033421 extends Sequence1 {

  private static final Z NUM = Z.valueOf(1000);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

