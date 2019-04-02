package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011882 [ n(n-1)/29 ].
 * @author Sean A. Irvine
 */
public class A011882 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(29);
  }
}
