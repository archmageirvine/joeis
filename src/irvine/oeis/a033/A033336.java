package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033336 <code>[ 16/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033336 implements Sequence {

  private static final Z NUM = Z.valueOf(16);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

