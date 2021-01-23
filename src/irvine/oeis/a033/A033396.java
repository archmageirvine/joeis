package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033396 [ 76/n ].
 * @author Sean A. Irvine
 */
public class A033396 implements Sequence {

  private static final Z NUM = Z.valueOf(76);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

