package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033368 <code>[ 48/n ]</code>.
 * @author Sean A. Irvine
 */
public class A033368 implements Sequence {

  private static final Z NUM = Z.valueOf(48);
  private long mN = 0;

  @Override
  public Z next() {
    return NUM.divide(++mN);
  }
}

