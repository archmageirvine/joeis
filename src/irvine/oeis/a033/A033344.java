package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033344 a(n) = floor(24/n).
 * @author Sean A. Irvine
 */
public class A033344 implements Sequence {

  private static final Z NUM = Z.valueOf(24);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

