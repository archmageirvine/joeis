package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033366 a(n) = floor(46/n).
 * @author Sean A. Irvine
 */
public class A033366 implements Sequence {

  private static final Z NUM = Z.valueOf(46);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

