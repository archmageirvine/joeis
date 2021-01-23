package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011884 Floor(n(n - 1)/31).
 * @author Sean A. Irvine
 */
public class A011884 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).divide(31);
  }
}
