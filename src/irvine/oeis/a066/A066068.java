package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066068 a(n) = n^n + n.
 * @author Sean A. Irvine
 */
public class A066068 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN).add(mN);
  }
}
