package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033420 [ 100/n ].
 * @author Sean A. Irvine
 */
public class A033420 implements Sequence {

  private static final Z NUM = Z.valueOf(100);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

