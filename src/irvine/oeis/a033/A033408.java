package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033408 <code>[ 88/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033408 implements Sequence {

  private static final Z NUM = Z.valueOf(88);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

