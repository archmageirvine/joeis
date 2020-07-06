package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033414 <code>[ 94/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033414 implements Sequence {

  private static final Z NUM = Z.valueOf(94);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

