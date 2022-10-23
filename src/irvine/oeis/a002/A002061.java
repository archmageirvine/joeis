package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002061 Central polygonal numbers: a(n) = n^2 - n + 1.
 * @author Sean A. Irvine
 */
public class A002061 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).add(1);
  }
}
