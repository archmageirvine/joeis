package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011908 <code>[ n(n-1)(n-2)/26 ]</code>.
 * @author Sean A. Irvine
 */
public class A011908 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(mN - 1).multiply(++mN).divide(26);
  }
}
