package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033386 [ 66/n ].
 * @author Sean A. Irvine
 */
public class A033386 implements Sequence {

  private static final Z NUM = Z.valueOf(66);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

