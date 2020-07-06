package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033393 <code>[ 73/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033393 implements Sequence {

  private static final Z NUM = Z.valueOf(73);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

