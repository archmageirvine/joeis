package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033363 <code>[ 43/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033363 implements Sequence {

  private static final Z NUM = Z.valueOf(43);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

