package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011871 <code>[ n(n-1)/18 ]</code>.
 * @author Sean A. Irvine
 */
public class A011871 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(18);
  }
}
