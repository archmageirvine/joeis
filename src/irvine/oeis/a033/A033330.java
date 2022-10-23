package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033330 a(n) = floor(10/n).
 * @author Sean A. Irvine
 */
public class A033330 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.TEN.divide(++mN);
  }
}

