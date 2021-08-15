package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033357 a(n) = floor(37/n).
 * @author Sean A. Irvine
 */
public class A033357 implements Sequence {

  private static final Z NUM = Z.valueOf(37);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

