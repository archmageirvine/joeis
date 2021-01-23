package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033394 [ 74/n ].
 * @author Sean A. Irvine
 */
public class A033394 implements Sequence {

  private static final Z NUM = Z.valueOf(74);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

