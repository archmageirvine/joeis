package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011919 <code>[ n(n-1)(n-2)(n-3)/9 ]</code>.
 * @author Sean A. Irvine
 */
public class A011919 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(mN - 1).multiply(mN - 2).multiply(++mN).divide(9);
  }
}
