package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033383 <code>[ 63/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033383 implements Sequence {

  private static final Z NUM = Z.valueOf(63);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

