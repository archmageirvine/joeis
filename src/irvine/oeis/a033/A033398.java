package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033398 [ 78/n ].
 * @author Sean A. Irvine
 */
public class A033398 implements Sequence {

  private static final Z NUM = Z.valueOf(78);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

