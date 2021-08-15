package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033425 a(n) = floor(10^7/n).
 * @author Sean A. Irvine
 */
public class A033425 implements Sequence {

  private static final Z NUM = Z.valueOf(10000000);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

