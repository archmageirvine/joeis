package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033343 <code>[ 23/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033343 implements Sequence {

  private static final Z NUM = Z.valueOf(23);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

