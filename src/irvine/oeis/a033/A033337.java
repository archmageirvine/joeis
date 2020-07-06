package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033337 <code>[ 17/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033337 implements Sequence {

  private static final Z NUM = Z.valueOf(17);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

