package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011871 [ n(n-1)/18 ].
 * @author Sean A. Irvine
 */
public class A011871 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(18);
  }
}
