package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033409 [ 89/n ].
 * @author Sean A. Irvine
 */
public class A033409 implements Sequence {

  private static final Z NUM = Z.valueOf(89);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

