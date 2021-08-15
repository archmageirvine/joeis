package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033387 a(n) = floor(67/n).
 * @author Sean A. Irvine
 */
public class A033387 implements Sequence {

  private static final Z NUM = Z.valueOf(67);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

