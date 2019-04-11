package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011877 <code>[ n(n-1)/24 ]</code>.
 * @author Sean A. Irvine
 */
public class A011877 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(24);
  }
}
