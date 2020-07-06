package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033367 <code>[ 47/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033367 implements Sequence {

  private static final Z NUM = Z.valueOf(47);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

