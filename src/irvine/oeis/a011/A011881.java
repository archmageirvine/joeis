package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011881 [ n(n-1)/28 ].
 * @author Sean A. Irvine
 */
public class A011881 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(28);
  }
}
