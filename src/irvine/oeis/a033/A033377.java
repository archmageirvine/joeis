package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033377 a(n) = floor(57/n).
 * @author Sean A. Irvine
 */
public class A033377 implements Sequence {

  private static final Z NUM = Z.valueOf(57);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

