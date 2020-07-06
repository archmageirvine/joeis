package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033427 <code>[ 10^5/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033427 implements Sequence {

  private static final Z NUM = Z.valueOf(100000);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

