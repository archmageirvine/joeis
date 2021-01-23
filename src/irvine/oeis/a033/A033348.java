package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033348 [ 28/n ].
 * @author Sean A. Irvine
 */
public class A033348 implements Sequence {

  private static final Z NUM = Z.valueOf(28);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

