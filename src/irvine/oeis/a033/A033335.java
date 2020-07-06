package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033335 <code>[ 15/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033335 implements Sequence {

  private static final Z NUM = Z.valueOf(15);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

