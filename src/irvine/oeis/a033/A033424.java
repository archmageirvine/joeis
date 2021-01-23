package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033424 [ 10^8/n ].
 * @author Sean A. Irvine
 */
public class A033424 implements Sequence {

  private static final Z NUM = Z.valueOf(100000000);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

