package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033362 [ 42/n ].
 * @author Sean A. Irvine
 */
public class A033362 implements Sequence {

  private static final Z NUM = Z.valueOf(42);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

