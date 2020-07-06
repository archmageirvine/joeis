package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033378 <code>[ 58/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033378 implements Sequence {

  private static final Z NUM = Z.valueOf(58);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

