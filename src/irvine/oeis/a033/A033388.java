package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033388 [ 68/n ].
 * @author Sean A. Irvine
 */
public class A033388 implements Sequence {

  private static final Z NUM = Z.valueOf(68);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

