package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033332 <code>[ 12/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033332 implements Sequence {

  private static final Z NUM = Z.valueOf(12);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

