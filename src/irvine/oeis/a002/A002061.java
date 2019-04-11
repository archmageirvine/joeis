package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002061 Central polygonal numbers: <code>a(n) = n^2 - n + 1</code>.
 * @author Sean A. Irvine
 */
public class A002061 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).add(1);
  }
}
