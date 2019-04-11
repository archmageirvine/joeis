package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011885 <code>[ n(n-1)/32 ]</code>.
 * @author Sean A. Irvine
 */
public class A011885 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(32);
  }
}
