package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033360 <code>[ 40/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033360 implements Sequence {

  private static final Z NUM = Z.valueOf(40);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

