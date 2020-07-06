package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033351 <code>[ 31/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033351 implements Sequence {

  private static final Z NUM = Z.valueOf(31);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

