package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033389 a(n) = floor(69/n).
 * @author Sean A. Irvine
 */
public class A033389 implements Sequence {

  private static final Z NUM = Z.valueOf(69);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

