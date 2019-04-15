package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011884 <code>Floor(n(n - 1)/31)</code>.
 * @author Sean A. Irvine
 */
public class A011884 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(31);
  }
}
