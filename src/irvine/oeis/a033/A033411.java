package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033411 [ 91/n ].
 * @author Sean A. Irvine
 */
public class A033411 implements Sequence {

  private static final Z NUM = Z.valueOf(91);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

